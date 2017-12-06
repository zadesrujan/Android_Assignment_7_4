package com.example.user.android_assignment_7_4;
//Package objects contain version information about the implementation and specification of a Java package.
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    //public is a method and fields can be accessed by the members of any class.
    //class is a collections of objects.
    //created MainActivity and extends with AppCompatActivity which is Parent class.
EditText username,email,password;
Button Login;

    @Override
    //we use override to tells the compiler that the following method overrides a method of its superclass.
    protected void onCreate(Bundle savedInstanceState) {
        //protected can be accessed by within the package and class and subclasses
        //The Void class is an uninstantiable placeholder class to hold a reference to the Class object
        //representing the Java keyword void.
        //The savedInstanceState is a reference to a Bundle object that is passed into the onCreate method of every Android Activity
        // Activities have the ability, under special circumstances, to restore themselves to a previous state using the data stored in this bundle.
        super.onCreate(savedInstanceState);
        //Android class works in same.You are extending the Activity class which have onCreate(Bundle bundle) method in which meaningful code is written
        //So to execute that code in our defined activity. You have to use super.onCreate(bundle)
        setContentView(R.layout.activity);
        //R means Resource
        //layout means design
        //main is the xml you have created under res->layout->main.xml
        //Whenever you want to change your current Look of an Activity or when you move from one Activity to another .
        //he other Activity must have a design to show . So we call this method in onCreate and this is the second statement to set
        //the design


        username = (EditText) findViewById(R.id.editText);
        //created of giving username
        email = (EditText) findViewById(R.id.editText2);
        //created of email
        password = (EditText)findViewById(R.id.editText3);
        //created an text for giving password
        Login = (Button) findViewById(R.id.button);
        //creating login button

        Login.setOnClickListener(new View.OnClickListener() {
            //created on click listener,by clicking on button we will directed to anthor screen.
            @Override
            public void onClick(View view) {
                String name = username.getText().toString();
                //here String type will the text of email
                Bundle bundle = new Bundle();
                //created bundle
                bundle.putString("name", name);
                //it puts the string value here
                Intent i = new Intent(MainActivity.this, Main2Activity.class);
                //creating intent obj for this class with the UserDetails class
                i.putExtras(bundle);
                //in bundle we use i.putExtras
                startActivity(i);
                //here it starts the activity
            }
        });

    }
}
