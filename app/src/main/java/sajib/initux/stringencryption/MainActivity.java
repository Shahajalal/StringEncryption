package sajib.initux.stringencryption;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;

import javax.crypto.Cipher;
import javax.crypto.KeyGenerator;
import javax.crypto.NoSuchPaddingException;
import javax.crypto.SecretKey;

import com.sun.mail.util.BASE64DecoderStream;
import com.sun.mail.util.BASE64EncoderStream;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        TextView text;
        text = findViewById(R.id.textviewid);
        //String originalString = "192.168.0.1,192.168.0.2";
        //System.out.println("Original String to encrypt - " + originalString);
        //String encryptedString = AES.encrypt(originalString);
        //System.out.println("Encrypted String - " + encryptedString);
        String decryptedString = AES.decrypt("BSPwYECxsI8vbIzLpZIY5A==");
        System.out.println("After decryption - " + decryptedString);

    }

}

