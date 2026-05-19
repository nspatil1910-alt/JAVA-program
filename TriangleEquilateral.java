 
        int sum = a1 + a2 + a3;
		
		String result = (a1 == a2 && a2 == a3 && a1 > 0) 
                        ? "Equilateral Triangle" 
                        : "Not Equilateral Triangle";

        System.out.println("Output: " + result);
        input.close();
    }
}
