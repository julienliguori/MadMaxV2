package Model;

public class Decrypt {
	static String crypt(String data, String key) {
		String chaineCryptee = "";
	    for(int i = 0, j = 0; i < data.length(); i++)
	    {
	        chaineCryptee += (char)((int)data.charAt(i) ^ (int)key.charAt(j));
	   //     System.out.println((int)key.charAt(j)); 
	        j++;
	        if(j >= key.length()) j = 0;
	    }
	    return chaineCryptee;
	}
	
	static String decrypt(String data, String attente) {
		String chaineCryptee = "";
		int a,b,c,d,e,f,g,h,i,j,k,l;
		a = b = c = d = e = f = g = h = i = j = k = l = 0;
		a=97;
		b=98;
		c=99;
		d=100;
		e=101;
		f=102;
		g=103;
		h=104;
		int table[] = {a,b,c,d,e,f,g,h,i,j,k,l};
		for(table[8] = 97; table[8] < 123; table[8]++) {
			for(table[9] = 97; table[9] < 123; table[9]++) {
				for(table[10] = 97; table[10] < 123; table[10]++) {
					for(table[11] = 97; table[11] < 123; table[11]++) {
					//	System.out.println("i : " + i + " j : " + j + " k : " + k + " l : " + l);
						for(int y = 0, z = 0; y < data.length(); y++){
					    	chaineCryptee += (char)((int)data.charAt(y) ^ table[z]);
					    	/*if(j==0) {
					    		chaineCryptee += (char)((int)data.charAt(i) ^ a);
					    	}else if(j==1) {
					    		chaineCryptee += (char)((int)data.charAt(i) ^ b);
					    	}else if(j==2) {
					    		chaineCryptee += (char)((int)data.charAt(i) ^ c);
					    	}else if(j==3) {
					    		chaineCryptee += (char)((int)data.charAt(i) ^ d);
					    	}*/
					        z++;
					        if(z >= 12) z = 0;
					    }
					//    chaineCryptee += "\n";
				        	if (chaineCryptee.contains(attente)) {
				        		for(int w=0;w<11;w++) {
				        			table[w] = 123;
				        		}
				        		table[11] = 122;
				        		System.out.println("attente : " + attente);
					        	System.out.println("resultat : " + chaineCryptee);
				        	}else {
				        		chaineCryptee = "";
				        	}
				        }
					}
				}
			}
		return chaineCryptee;
	}
}
