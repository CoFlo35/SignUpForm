package edu.temple.signupform

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.widget.Toast


class FormActivity() : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var name :String
        val inputName = findViewById<TextView>(R.id.editTextViewName)
        val inputEmail = findViewById<TextView>(R.id.TextViewEmail)
        val inputPassword = findViewById<TextView>(R.id.editTextTextPassword)
        val inputPasswordConfirm = findViewById<TextView>(R.id.editTextTextPasswordConfirm)
        val saveButton = findViewById<Button>(R.id.buttonSave)
        val displayText = findViewById<TextView>(R.id.TextViewDisplayMessage)

        saveButton.setOnClickListener() {
            //displays whether an error should be attached to a TextView
            isNoEntry(inputName,"Name")
            isNoEntry(inputEmail, "Email")
            isNoEntry(inputPassword, "Password")
            isNoEntry(inputPasswordConfirm, "Confirm Password")


            if(hasError(inputPassword) == false && hasError(inputPasswordConfirm) == false) {
                //second check if the passwords match, display error if not
                if (textMatch(inputPassword, inputPasswordConfirm) == true) {
                    //remove previous error messages that passwords did not match
                    inputPassword.error = null
                    inputPasswordConfirm.error = null
                    //set name variable to be displayed in Toast message
                    name = inputName.text.toString()
                    //get rid of display text
                    displayText.text = ""
                    //create Toast message
                    Toast.makeText(
                        applicationContext,
                        "Welcome, ${name}, to the SignUpForm App!",
                        Toast.LENGTH_LONG
                    ).show()
                } else {
                    //set errors that the passwords did not match
                    inputPassword.setError("Passwords Do Not Match")
                    inputPasswordConfirm.setError("Passwords Do Not Match")
                }
            }

            //Rechecks if any TextViews have an error attached
            //if so, display prompt to validate fields
            if(hasError(inputName) == false && hasError(inputEmail) == false
                && hasError(inputPassword)==false && hasError(inputPasswordConfirm) == false){
            }else{displayText.text = "Please Recheck all Fields"}

        }
    }

    // Method Receives a TextView and name of TextView to be displayed for error purposes
    private fun isNoEntry(view: TextView, name:String){
        if(view.text.isNotEmpty()){}
        else{view.setError("${name} Cannot Be Blank")}
    }
    //Uses the .getError method to determine if there is an Error attached
    // If there is an error return True
    private fun hasError(view: TextView):Boolean{
        if(view.getError() == null){return false}
        else{return true}
    }
    //Method to check the literal strings of the Password and Confirmation Password
    private fun textMatch(view1: TextView, view2:TextView):Boolean{
        return view1.text.toString() == view2.text.toString()
    }


}