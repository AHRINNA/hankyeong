package com.biz.thread.classes;
// single tone 형태의 가장 발달된 형태. 가장 안전하다

// SingleTone은 하나의 변수만을 생성해서 공유해 사용하는 것이다. 콘솔 환경에서는 문제가 되지 않지만
// 서버환경에서는 다수의 사용자가 다수의 요청들을 하고 이것들을 처리해야하며 각각의 요청마다 클래스를 만들고
// 해결을 하려고 하면 아주 커다란 메모리가 필요할 것이다. 그래서 싱글톤을 사용하여 공유하여 사용한다
// 하나의 데이터에 쓰는 것은 static도 마찬가지지만 static은 여러 메소드가 침범하여 데이터에 중복되어 올라가는 문제가 생길 수 있다
// 이 코드는 속도도 가장 빠르고 동기화도 JVM이 잘 하여 가장 안전하다고 알려져있는 싱글톤 패턴이다
// 자신의 내부에서 자신의 인스턴스를 만드는 코드를 만들고 그 인스턴스를 리턴한다
// 클래스는 하나지만 필드는 운영체제가 필요한만큼 만들고 지우고를 반복한다
// 문제가 아예 없는 것은 아니지만 거의 없게 만들 수 있다
public class LazyClassV1 {
	public int sum; // not single tone
	private LazyClassV1() {
		
	}
	
	public static LazyClassV1 getInstance() {
		return LazyHolder.INSTANCE;
	}
	
	private static class LazyHolder { 
		private static final LazyClassV1 INSTANCE = new LazyClassV1();
	}
}
