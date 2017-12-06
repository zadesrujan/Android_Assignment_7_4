package com.example.user.android_assignment_7_4;
//Package objects contain version information about the implementation and specification of a Java package.
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;
import android.widget.Toast;

public class Main2Activity extends AppCompatActivity {
    //public is a method and fields can be accessed by the members of any class.
    //class is a collections of objects.
    //created MainActivity and extends with AppCompatActivity which is Parent class.

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
        setContentView(R.layout.activity_main2);
        //R means Resource
        //layout means design
        //main is the xml you have created under res->layout->main.xml
        //Whenever you want to change your current Look of an Activity or when you move from one Activity to another .
        //he other Activity must have a design to show . So we call this method in onCreate and this is the second statement to set
        //the design
        TextView name;
        String msg;

        name=(TextView)findViewById(R.id.textView);

        //it gets the intent
        Bundle getbundle =this.getIntent().getExtras();
        //getting bundle
        String n = getbundle.getString("name");
        //giving key namee
        name.setText("Welcome "+n);
        //here it displays the welcome username which we declared in the first activity
        Toast.makeText(getApplicationContext(),"Welcome to LoginScreen", Toast.LENGTH_SHORT).show();
        //it displays the toast here
    }
}
