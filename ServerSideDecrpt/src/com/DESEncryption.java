package com;
import java.security.spec.KeySpec;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
 
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.servlet.http.HttpServlet;

import sun.misc.BASE64Decoder;
import sun.misc.BASE64Encoder;
 
public class DESEncryption extends HttpServlet
{
 
    private static final String UNICODE_FORMAT = "UTF8";
    public static final String DES_ENCRYPTION_SCHEME = "DES";
    private KeySpec myKeySpec;
    private SecretKeyFactory mySecretKeyFactory;
    private Cipher cipher;
    byte[] keyAsBytes;
    private String myEncryptionKey;
    private String myEncryptionScheme;
    SecretKey key;
 
    public DESEncryption() throws Exception
    {
        myEncryptionKey = "asdfsdfsdsa";
        
        myEncryptionScheme = DES_ENCRYPTION_SCHEME;
        keyAsBytes = myEncryptionKey.getBytes(UNICODE_FORMAT);
        myKeySpec = new DESKeySpec(keyAsBytes);
        mySecretKeyFactory = SecretKeyFactory.getInstance(myEncryptionScheme);
        cipher = Cipher.getInstance(myEncryptionScheme);
        key = mySecretKeyFactory.generateSecret(myKeySpec);
    }
 
    /**
     * Method To Encrypt The String
     */
    public String encrypt(String unencryptedString) 
    {
        String encryptedString = null;
        try {
            cipher.init(Cipher.ENCRYPT_MODE, key);
            byte[] plainText = unencryptedString.getBytes(UNICODE_FORMAT);
            byte[] encryptedText = cipher.doFinal(plainText);
            BASE64Encoder base64encoder = new BASE64Encoder();
            encryptedString = base64encoder.encode(encryptedText);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return encryptedString;
    }
    /**
     * Method To Decrypt An Ecrypted String
     */
    public String decrypt(String encryptedString) 
    {
        String decryptedText=null;
        try {
            cipher.init(Cipher.DECRYPT_MODE, key);
            BASE64Decoder base64decoder = new BASE64Decoder();
            byte[] encryptedText = base64decoder.decodeBuffer(encryptedString);
            byte[] plainText = cipher.doFinal(encryptedText);
            decryptedText= bytes2String(plainText);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return decryptedText;
    }
    /**
     * Returns String From An Array Of Bytes
     */
    private static String bytes2String(byte[] bytes) 
    {
        StringBuffer stringBuffer = new StringBuffer();
        for (int i = 0; i< bytes.length; i++) 
        {
            stringBuffer.append((char) bytes[i]);
        }
        return stringBuffer.toString();
    }
 
    /**
     * Testing the DES Encryption And Decryption Technique
     * @throws Exception 
     */
    
    protected void service(javax.servlet.http.HttpServletRequest request, javax.servlet.http.HttpServletResponse response) throws javax.servlet.ServletException ,java.io.IOException
    {
    	try
    	{
    		
 String name=request.getParameter("t1");
 String pass=request.getParameter("t2");
    	
    	 		String stringToEncrypt=pass;
    		DESEncryption myEncryptor= new DESEncryption();
        	String encrypted=myEncryptor.encrypt(stringToEncrypt);
        	String decrypted=myEncryptor.decrypt(encrypted);
        Class.forName("com.mysql.jdbc.Driver");
		Connection conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/country","root","root");
		String sql="insert into login values(4,'"+name+"','"+encrypted+"')"; 
		Statement	stm=conn.createStatement();
        stm.execute(sql);
       
        String sql1="select * from login"; 
		Statement	stm1=conn.createStatement();
       ResultSet rs= stm.executeQuery(sql1);
        
        while(rs.next())
        {
        	int id=rs.getInt(1);
        	String nm=rs.getString(2);
			String pas=rs.getString(3);
			String eny=myEncryptor.encrypt(pas);
			String decrypted1=myEncryptor.decrypt(pas);
			System.out.println(id);
			System.out.println(nm);
			System.out.println("ecrypted value :"+eny);
			 	 System.out.println("Decrypted Value :"+decrypted1);
        }
        	}
    	catch (Exception e) 
    	{
    		e.printStackTrace();
		}
   
    }
}