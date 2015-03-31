function allLetter()
{ 
var fname = document.regi.first;
var letters = /^[A-Za-z]+$/;
if(fname.value.match(letters))
{
// Focus goes to next field i.e. Address.
document.regi.last.focus();
return true;
}
else
{
    
alert('Username must have alphabet characters only');
fname.focus();
return false;
}
}

function allLetter1()
{ 
var lname = document.regi.last;
var letters = /^[A-Za-z]+$/;
if(lname.value.match(letters))
{
// Focus goes to next field i.e. Address.
document.regi.user.focus();
return true;
}
else
{
alert('Username must have alphabet characters only');
lname.focus();
return false;
}
}


function phonenumber()
{
  var mo = document.regi.mob; 
  var phoneno = /^\d{10}$/;
  if(mo.value.match(phoneno))
        {
            document.regi.email.focus();
      return true;
        }
      else
        {
           
        alert("Not a valid Phone Number");
        mo.focus();
        return false;
        }
}

