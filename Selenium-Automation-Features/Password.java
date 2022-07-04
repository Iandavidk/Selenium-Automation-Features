package eCommerceLive;

//embedded in Login.java file

import java.util.Base64;

public class Password {

		
		static String encodedPassword = "QXBwaXVtMTIz";
		
		public static String getDecodedPassword() {
			return new String (Base64.getDecoder().decode(encodedPassword.getBytes()));
		}
}

