package HomeWork;

public  class abs{
    public static void main(String[] args) {
     String ta = "A ";
		ta = ta.concat("B ");//A B
		String tb = "C ";//C
		ta = ta.concat(tb);//A B C
		ta.replace('C','D');
		ta = ta.concat(tb);// A B C C
		System.out.println(ta);


	}


    }

