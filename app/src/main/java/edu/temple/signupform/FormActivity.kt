package edu.temple.signupform

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView


class FormActivity() : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val inputName = findViewById<TextView>(R.id.editTextViewName)
        val inputEmail = findViewById<TextView>(R.id.TextViewEmail)
        val inputPassword = findViewById<TextView>(R.id.editTextTextPassword)
        val inputPasswordConfirm = findViewById<TextView>(R.id.editTextTextPasswordConfirm)
        val saveButton = findViewById<Button>(R.id.buttonSave)
        val displayText = findViewById<TextView>(R.id.TextViewDisplayMessage)

        saveButton.setOnClickListener() {
            //redisplays whether an error should be attached to a TextView
            isNoEntry(inputName,"Name")
            isNoEntry(inputEmail, "Email")
            isNoEntry(inputPassword, "Password")
            isNoEntry(inputPasswordConfirm, "Confirm Password")

            //Rechecks if any TextViews have an error attached
            if(hasError(inputName) == true && hasError(inputEmail) == true
                && hasError(inputPassword)==true && hasError(inputPasswordConfirm) == true){
                displayText.text = "All Critera Filled"
            }else{displayText.text = "Please Recheck all Fields"}

        }

    }
    // Method Recieves a TextView and name of TextView to be displayed for error purposes
    private fun isNoEntry(view: TextView, name:String){
        if(view.text.isNotEmpty()){}
        else{view.setError("${name} Cannot Be Blank")}
    }
    //Uses the .getError method to determine if there is an Error attached
    // If there is an error return True
    private fun hasError(view: TextView):Boolean{
        if(view.getError() == null){return true}
        else{return false}
    }
    //Method to check the literal strings of the Password and Confirmation Password
    private fun textMatch(view1: TextView, view2:TextView):Boolean{
        return view1.text.toString() == view2.text.toString()
    }


}