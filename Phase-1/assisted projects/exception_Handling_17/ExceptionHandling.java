package exception_Handling_17;
	class MyException extends Exception{
		   String str1;
		   MyException(String str2) {
			str1=str2;
		   }
		   public String toString(){ 
			return ("MyException Occurred: "+str1) ;
		   }
		}
	     class ExceptionHandling{
		   public static void main(String args[]){
			try{
				System.out.println("Starting of try block");
				throw new MyException("This is My error Message");
			}
			catch(MyException exp){
				System.out.println("This is Catch Block") ;
				System.out.println(exp) ;
			}
		   }
		}