# SignUpForm
Validates User information to make sure that all fields are filled, errors will address unmarked fields accordingly. 
If Password and Confirm-Password fields do not match, errors will address both fields and prompt the user to recheck their entered information.

![SignUpForm Error Message Display](https://user-images.githubusercontent.com/43580764/134393307-7286b68a-2007-43a1-89bc-ed9639e91e7f.jpg)

If the Password and Confirm-Password fields match while the Name and Email fields are filled then a toast message will appear greeting the user on using the application. 
This code can be of use by any sort of application that requires a user to sign up for the service before using its features. 

![SignUpForm With Toast Message Displayed](https://user-images.githubusercontent.com/43580764/134393387-02f12095-248a-45f7-9f7a-b50ed6ee0a44.jpg)

The main methods check wheter a certain TextView currently has an error attached, whether two TextViews.text property are identical, and whether the TextViews.text field is left empty

![methods ](https://user-images.githubusercontent.com/43580764/134393584-7a5dc32c-be83-47a8-a3d7-f2a48a49474b.jpg)

Some drawbacks of the application are: Not validating whether an email address is legitimate, and making the user re-enter both Password and Confirm-Password fields if they do not
match before rechecking. Although I am positive the code could be restructured to deal with these problems, the code is written in such a way that it shoud make logical sense to most
any intermediate to begginer application programmer. 




