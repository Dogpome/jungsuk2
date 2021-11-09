package ch07객체지향2;

public class ch07_18클래스의공통적인 {
    // 제어자 static 붙일 수 있는 곳.
    // 1. 맴버변수
    // 모든 인스턴스에 공통적으로 사용되는 클래스 변수로 사용
    // 클래스 변수로 사용하면 인스턴스를 생성하지 않고 사용될 수 있음.
    // 클래스가 메모리에 로드될 때 생성. <-코드가 실행될 때 생성될 때
    // 메모리로 올라올 때를 생성한다고 부른다.

    // 2. 메서드
    // 인스턴스를 생성하지 않고 사용하는 static 메서드로 사용됨.
    // static메서드 내에서는 인스턴스 맴버를 사용 못함.

    // static 제어자 사용시
    // 인스턴스 맴버, iv 맴버 사용할 수 없음.

    // class StaticTest {
    // static int width = 200; // 클래스 변수(static변수)
    // static int height = 120; // 클래스 변수(static변수)

    // 객체 생성없이 사용가능 static,
    // 대신 객체가 필요한 iv와 인스턴스 매서드 못씀

}


