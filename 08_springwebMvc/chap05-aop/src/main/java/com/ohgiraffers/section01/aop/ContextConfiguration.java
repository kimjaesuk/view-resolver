package com.ohgiraffers.section01.aop;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@Configuration
/*
* assectj의 autoProxy 사용에 관한 설정을 ㅎ주어야 advice가 동작한다.
* proxtTargetClass= true 설정은 cglid를 이용한 프록시를 생성하는 방식인데
* spring 3.2부터 스프링 프레임 워크에 포함되어 별도 라이브러리 설정을 하지않고도 사용할 수 있다.
* 성능 면에서 더 우수하다
*
* 다음을 설정하지 않으면 jdk를 통해 proxy를 생성한다.
*
* cglid : 클래스 상속을 통해 프록시를 생성한다. 인터페이스가 아닌 구체적인 클래스에도 프록시를 적용할 수 있다.
* jdk 동적 프록시 : 이널페이스를 구현하는 프록시를 생성한다. 인터페이스가 없는 클래스에서는 사용할 수 없다.
* */
@EnableAspectJAutoProxy(proxyTargetClass = true)
public class ContextConfiguration {
}
