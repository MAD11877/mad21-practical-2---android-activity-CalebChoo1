package sg.edu.np.madpractical2_activity_s10205375;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    User user1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        user1 = new User();

        TextView name = findViewById(R.id.name);
        user1.name = "John Lim";
        name.setText(user1.getName());

        TextView desc = findViewById((R.id.desc));
        user1.description = "Hi i am John Lim, 25 years old and I live in Singapore.";
        desc.setText(user1.getDesc());
    }

    public void method(View v) {
        TextView follow_text = findViewById((R.id.followbtn));
        if (!user1.followed) {
            follow_text.setText("Unfollow");
            user1.followed = true;
        }
        else {
            follow_text.setText("Follow");
            user1.followed = false;
        }
    }

}