import java.util.Vector;
import java.util.Scanner;
import java.util.InputMismatchException;

public class Lab3{
	public static void main(String[] args){
		try{
			Vector<Mark> marks = new Vector<Mark>(){{add(new Mark(5f,4f)); 
								 add(new Mark(1f,-1f)); 
								 add(new Mark(3f,-5f));
								 add(new Mark(2f,-2f));
								 add(new Mark(-3f,-5f));
								 add(new Mark(0f,-1f));
								 add(new Mark(-5f, 3f));
								}};
			System.out.println("Введенное значение R(целое неотрицательное число число не больше 2147483647)");
			int R=(new Scanner(System.in)).nextInt();
			if (R<0)
				throw new InputMismatchException();
			Outline outline = new Outline(R);
			for(Mark mark: marks){
				System.out.print("Точка с координатами "+mark);
				if(outline.didBelongsToOutline(mark)){
					System.out.println(" в области");
				}
				else{
					System.out.println(" не в области");
				}
			}
		}
		catch(InputMismatchException e){
			System.out.println("Введенное значение должно быть целым неотрицательнымы числом числом не больше 2147483647");
		}
	}
}