package Exam14;

public class ActionExam {

	public static void main(String[] args) {
		try {
			Class clazz = Class.forName("Exam14.SendAction");
			//Class clazz = Class.forName("Exam14.RecieveAction");
			Action action = (Action)  clazz.newInstance();
			action.execute();
		} catch(ClassNotFoundException e) {
			e.printStackTrace();
		} catch(InstantiationException e) {
			e.printStackTrace();
		} catch(IllegalAccessException e) {
			e.printStackTrace();
		}

	}

}
