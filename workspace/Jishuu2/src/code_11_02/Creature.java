package code_11_02;
/*
public abstract class Creature {
	public abstract void run();
}

 これはフィールド存在しないし、抽象メソッドだけ。
 インタフェイスの条件満たすから、以下のように書ける。*/


public interface Creature{
	public void run(); // インタフェースのメソッドはpublicかつ、abstractなのでpublic abstract略可能
}
