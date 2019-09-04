// Validations for Interface

var dtCh= "/";
var minYear=1900;
var maxYear=2100;

// Declaring required variables
var digits = "0123456789";
// non-digit characters which are allowed in phone numbers
var phoneNumberDelimiters = "/()-, ";
// characters which are allowed in international phone numbers
// (a leading + is OK)
var validWorldPhoneChars = phoneNumberDelimiters + "+";
// Minimum no of digits in an international phone no.
//var minDigitsInIPhoneNumber = 10;

//*********New Function nullValueCheck()********************************************
//Created on 10/09/2006 by Siba Kamal Lochan Patra
//Null value check for all field passed irrespective to textfield naming convention
//**********************************************************************************

function isValidEmail(email)
{
    var re = /\S+@\S+\.\S+/;
    return re.test(email);
}
function isValidTelNo(inputtxt){

  var phoneno = /^[\d\s]+$/;
  if(inputtxt.match(phoneno))  {
      return true;
  }else{
      return false;
  }

}

function isValidCurrency(fieldValue) {

decallowed = 2;  // how many decimals are allowed?

if (isNaN(fieldValue) || fieldValue == "") {
return false;
}
else {
if (fieldValue.indexOf('.') == -1) fieldValue += ".";
dectext = fieldValue.substring(fieldValue.indexOf('.')+1, fieldValue.length);

if (dectext.length > decallowed)
{
return false;
      }
else {
//alert ("That number validated successfully.");
return true;
      }
   }
}


function systemDate()
{
var dt = new Date();
var h =dt.getHours();
var m =dt.getMinutes();
var s =dt.getSeconds();
var x= h+":"+m+":"+s;

var dd = "";
var mm = "";
var yyyy = "";

dd = new String (dt.getDate());
mm = new String (dt.getMonth()+1);
yyyy = new String (dt.getFullYear());

/*
if(dd.length <= 1){
  dd = "0"+dd;
}

    
if(mm.length <= 1){
  mm = "0"+mm;
}

*/
    
var d = dd+"/"+mm+"/" +yyyy;
return d;
}
function systemTime()
{
var dt = new Date();
var h =dt.getHours();
var m =dt.getMinutes();
var s =dt.getSeconds();
var x= h+":"+m+":"+s;
var d =dt.getDate()+"/"+dt.getMonth()+"/" +dt.getFullYear();
return x;
}

function systemTime_HH_MM()
{
var dt = new Date();
var h =new String(dt.getHours());
var m =new String(dt.getMinutes());
var s =new String(dt.getSeconds());
 
if(h.length <= 1){
  h = "0"+h;
}
 
if(m.length <= 1){
  m = "0"+m;
}

var x= h+":"+m;

return x;
}

function systemTime_HH_MM_SS()
{
var dt = new Date();
var h =dt.getHours();
var m =dt.getMinutes();
var s =dt.getSeconds();
var x= h+":"+m+":"+s;
var d =dt.getDate()+"/"+dt.getMonth()+"/" +dt.getFullYear();
return x;
}



// Added on 09-04-2006 for Crystal Report

function ParseUrlString(s)
{//abc?world#my&dear%miss
var str=""
var i=0
for(i=0;i<s.length;i++)
	{var c = s.charAt(i);
     if (c=="&") str=str+"~";
	 else if(c=="#") str=str+"`";
	 else if(c=="%") str=str+"^";
	 else
	 	str=str+c;
	 }
//alert(str);
return str;
}



function DtFormat(s)
{

var str="("+s.substring(6,10)+","+s.substring(3,5)+","+s.substring(0,2)+")"
return (str)
}

function DTimeFormat(s)
{
var str="("+s.substring(6,10)+","+s.substring(3,5)+","+s.substring(0,2)+",0,0,0)"
return (str)
}

function readOnlyAll()
{
var howMany=document.forms[0].elements.length;

	for(var i=0;i<howMany;i++)
	{
	if((document.forms[0].elements[i].type=="text")||(document.forms[0].elements[i].type=="textarea"))
	 	document.forms[0].elements[i].readOnly=true;
	
	if(document.forms[0].elements[i].type=="select-one")
	document.forms[0].elements[i].readOnly=true;
	
	if((document.forms[0].elements[i].type=="radio")||(document.forms[0].elements[i].type=="checkbox"))
		document.forms[0].elements[i].readOnly=true;
	if((document.forms[0].elements[i].type=="button"))
		document.forms[0].elements[i].disabled=true;
	if((document.forms[0].elements[i].type=="file"))
		document.forms[0].elements[i].readOnly=true;

	}
}

function compareDate(s1,s2)
{	
	var d1=parseInt(s1.substring(0,2),10)
	var m1=GetMonthCode(s1.substring(3,6))
	var y1=parseInt(s1.substring(7,11),10)
	
	var d2=parseInt(s2.substring(0,2),10)
	var m2=GetMonthCode(s2.substring(3,6))
	var y2=parseInt(s2.substring(7,11),10)
	
	alert('d1='+d1+'-'+m1+'-'+y1+'   d2='+d2+'-'+m2+'-'+y2)
	if(y1>y2) return 1
	if(y1==y2)
		{ if(m1>m2) return 1
		  if(m1==m2)
		  	{if(d1>d2) return 1
			 if(d1==d2) return 0
			 else
			 	return -1
			 }
			else
				return -1
		}
	else
		return -1
}




function compDate(s1,s2)
{	
	var d1=parseInt(s1.substring(0,2),10)
	var m1=parseInt(s1.substring(3,5),10)
	var y1=parseInt(s1.substring(6,10),10)
	
	var d2=parseInt(s2.substring(0,2),10)
	var m2=parseInt(s2.substring(3,5),10)
	var y2=parseInt(s2.substring(6,10),10)
	
	//alert('d1='+d1+'-'+m1+'-'+y1+'   d2='+d2+'-'+m2+'-'+y2)
	if(y1>y2) return 1
	if(y1==y2)
		{ if(m1>m2) return 1
		  if(m1==m2)
		  	{if(d1>d2) return 1
			 if(d1==d2) return 0
			 else
			 	return -1
			 }
			else
				return -1
		}
	else
		return -1
}



function compareTime(t1,t2)
{	
    try{
	var h1=parseInt(t1.substring(0,2),10);
	var h2=parseInt(t2.substring(0,2),10);
	
	var m1=parseInt(t1.substring(3,5),10);
	var m2=parseInt(t2.substring(3,5),10);
	
	//alert("h1 :" + h1 + " m1 :" + m1 + " h2 :" + h2  + "m2 :" + m2);
        
	
	if(h1>h2) return 1
	if(h1==h2)
		{ if(m1>m2) return 1
		  if(m1==m2)
		  	return 0
                  else
			return -1
		}
	else
		return -1
            
    }catch(e){
       ;
    }
    return 0;
}

function hourDiff(t1,t2)
{	
    try{
       // alert("t1 : "+ t1);
       // alert("t2 : " + t2);
	var h1=parseInt(t1.substring(0,2),10);
	var h2=parseInt(t2.substring(0,2),10);
	
	var m1=parseInt(t1.substring(3,5),10);
	var m2=parseInt(t2.substring(3,5),10);
	
        var hhdiff = 0;
        var mmdiff = 0;
	//alert("h1 :" + h1 + " m1 :" + m1 + " h2 :" + h2  + "m2 :" + m2);
        
	//alert("h1:m1 = " + h1+":"+m1);
        //alert("h2:m2 = " + h2+":"+m2);
    
	if(h1>h2) {
            hhdiff = h1 - h2;
              if(m1>m2) {
                       mmdiff = mmdiff + math.round((m1-m2)/60);
                    }
                    
        }else if(h1==h2)
		{ 
                    if(m1>m2) {
                       mmdiff = mmdiff + math.round((m1-m2)/60);
                    }else if (m1==m2){
                        mmdiff = 0;
                    }
               
	 }else {
             hhdiff = (h2 - h1) * (-1);
              
         }
            
    }catch(e){
        ;
    }
    var hr = new String(hhdiff);
    var min = new String(mmdiff)
    
    
    //alert("Difference Hour:Min = " + hr+":"+min);
    return hr+":"+min;
}



function isInteger(s)
{   var i;
    try{
        for (i = 0; i < s.length; i++)
        {   
            // Check that current character is number.
            var c = s.charAt(i);
            if (((c < "0") || (c > "9"))) return false;
        }
    }catch(e)
    {
        return false;
    }
    
    // All characters are numbers.
    return true;
}


function checkInternationalPhone(obj){
var strPhone=obj.value;
s=stripCharsInBag(strPhone,validWorldPhoneChars);
	return (isInteger(s));
//return (isInteger(s) && s.length >= minDigitsInIPhoneNumber);
}

function DoUpper(obj)
	{obj.value=Trim(obj.value);
	obj.value=obj.value.toUpperCase();
	
	}

function stripCharsInBag(s, bag){
	var i;
    var returnString = "";
    // Search through string's characters one by one.
    // If character is not in bag, append to returnString.
    for (i = 0; i < s.length; i++){   
        var c = s.charAt(i);
        if (bag.indexOf(c) == -1) returnString += c;
    }
    return returnString;
}

function daysInFebruary (year){
	// February has 29 days in any year evenly divisible by four,
    // EXCEPT for centurial years which are not also divisible by 400.
    return (((year % 4 == 0) && ( (!(year % 100 == 0)) || (year % 400 == 0))) ? 29 : 28 );
}
function DaysArray(n) {
	for (var i = 1; i <= n; i++) {
		this[i] = 31
		if (i==4 || i==6 || i==9 || i==11) {this[i] = 30}
		if (i==2) {this[i] = 29}
   } 
   return this
}

function isDateStr(dtStr){
	var daysInMonth = DaysArray(12)
	var pos1=dtStr.indexOf(dtCh)
	var pos2=dtStr.indexOf(dtCh,pos1+1)

	var strDay = dtStr.substring(0,pos1)
	var strMonth = dtStr.substring(pos1+1,pos2)
	var strYear=dtStr.substring(pos2+1)
	strYr=strYear
	if (strDay.charAt(0)=="0" && strDay.length>1) strDay=strDay.substring(1)
	if (strMonth.charAt(0)=="0" && strMonth.length>1) strMonth=strMonth.substring(1)
	for (var i = 1; i <= 3; i++) {
		if (strYr.charAt(0)=="0" && strYr.length>1) strYr=strYr.substring(1)
	}
	month=parseInt(strMonth)
	day=parseInt(strDay)
	year=parseInt(strYr)
	if (pos1==-1 || pos2==-1){
		//alert("The date format should be : dd/mm/yyyy")
		return false
	}
	if (strMonth.length<1 || month<1 || month>12){
		//alert("Please enter a valid month")
		return false
	}
	if (strDay.length<1 || day<1 || day>31 || (month==2 && day>daysInFebruary(year)) || day > daysInMonth[month]){
		//alert("Please enter a valid day")
		return false
	}
	if (strYear.length != 4 || year==0 || year<minYear || year>maxYear){
		//alert("Please enter a valid 4 digit year between "+minYear+" and "+maxYear)
		return false
	}
	if (dtStr.indexOf(dtCh,pos2+1)!=-1 || isInteger(stripCharsInBag(dtStr, dtCh))==false){
		//alert("Please enter a valid date")
		return false
	}
return true
}

function isDate(obj){
var dtStr=obj.value;

	var daysInMonth = DaysArray(12)
	var pos1=dtStr.indexOf(dtCh)
	var pos2=dtStr.indexOf(dtCh,pos1+1)
	var strDay=dtStr.substring(0,pos1)
	var strMonth=dtStr.substring(pos1+1,pos2)
	var strYear=dtStr.substring(pos2+1)
	strYr=strYear
	if (strDay.charAt(0)=="0" && strDay.length>1) strDay=strDay.substring(1)
	if (strMonth.charAt(0)=="0" && strMonth.length>1) strMonth=strMonth.substring(1)
	for (var i = 1; i <= 3; i++) {
		if (strYr.charAt(0)=="0" && strYr.length>1) strYr=strYr.substring(1)
	}
	month=parseInt(strMonth)
	day=parseInt(strDay)
	year=parseInt(strYr)
	if(dtStr.length!=0)
	{
	if (pos1==-1 || pos2==-1){
		//alert("The date format should be : dd/mm/yyyy")
		obj.select();
		return false
	}
	else if (strMonth.length<1 || month<1 || month>12){
		//alert("Please enter a valid month")
		obj.select();
		return false
	}
	else if (strDay.length<1 || day<1 || day>31 || (month==2 && day>daysInFebruary(year)) || day > daysInMonth[month]){
		//alert("Please enter a valid day")
		obj.select();
		return false
	}
	else if (strYear.length != 4 || year==0 || year<minYear || year>maxYear){
		//alert("Please enter a valid 4 digit year between "+minYear+" and "+maxYear)
		obj.select();
		return false
	}
	else
	return true
  }
}


//check for valid name(alphabets only)

function specialCheck(xField)
{
var i, check;
	check = true;
	i = xField.length;
	
	for( j =0;j<=i;j++ )
	{
		pos = xField.charAt(j);
		if ( pos == "~" || pos == "'" || pos == "!" || pos == "$" )
		{
		check = false;
		}
		else if ( pos == "@" || pos == "#" || pos == "%" || pos == "^")
		{
		check = false;
		}
		else if ( pos == "*" || pos == "{" || pos == "}" || pos == ";")
		{
		check = false;
		}
		else if ( pos == ":" ||  pos == "|" || pos == "<" || pos == "`")
		{
		check = false;
		}
		else if ( pos == "1" || pos == "2" || pos == "3" || pos == "4")
		{
		check = false;
		}
		else if ( pos == "5" ||  pos == "6" || pos == "7")
		{
		check = false;
		}
		else if ( pos == "8" ||  pos == "9" || pos == "0")
		{
		check = false;
		}
		else if ( pos == "+" ||  pos == "=" || pos == "-" || pos == "_")
		{
		check = false;
		}
	}
return check;		
}	

function checkAlpha(itemname) {
var itemvalue=itemname.value;
 if(!specialCheck(itemvalue))
 {
 alert("Invalid entry in this field.");
 itemname.select();
 }
}


function AllowAlpha(text)
{
var a=new Array(" ","A","B","C","D","E","F","G","H","I","J","K","L","M","N","O","P","Q","R","S","T","U","V","W","X","Y","Z","a","b","c","d","e","f","g","h","i","j","k","l","m","n","o","p","q","r","s","t","u","v","w","x","y","z");
 
 var ok=true;
 text=Trim(text);
 
	for(var i=0;i<text.length;i++)
	{
		var c=text.charAt(i);
		var found=false;
		for(var j=0;j<a.length;j++)
		{
		if(c==a[j])
			found=true;
		}
	if(!found)
	ok=false;
	}
 if(!ok)
 alert("Wrong Entry. Only alphabets allowed");
return false;
}

function LTrim(str)
       
        {
                var whitespace = new String(" \t\n\r");

                var s = new String(str);

                if (whitespace.indexOf(s.charAt(0)) != -1) {
                    // We have a string with leading blank(s)...

                    var j=0, i = s.length;

                    // Iterate from the far left of string until we
                    // don't have any more whitespace...
                    while (j < i && whitespace.indexOf(s.charAt(j)) != -1)
                        j++;


                    // Get the substring from the first non-whitespace
                    // character to the end of the string...
                    s = s.substring(j, i);
                }

                return s;
        }

function RTrim(str)
       
        {
                // We don't want to trip JUST spaces, but also tabs,
                // line feeds, etc.  Add anything else you want to
                // "trim" here in Whitespace
                var whitespace = new String(" \t\n\r");

                var s = new String(str);

                if (whitespace.indexOf(s.charAt(s.length-1)) != -1) {
                    // We have a string with trailing blank(s)...

                    var i = s.length - 1;       // Get length of string

                    // Iterate from the far right of string until we
                    // don't have any more whitespace...
                    while (i >= 0 && whitespace.indexOf(s.charAt(i)) != -1)
                        i--;

                    // Get the substring from the front of the string to
                    // where the last non-whitespace character is...
                    s = s.substring(0, i+1);
                }

                return s;
        }


function Trim(str)
        {
                return RTrim(LTrim(str));
        }


function isNullString(obj, objTitle)
{
	if (obj.value.length ==0) {
		alert('Please enter the ' + objTitle);
		obj.focus();
		return true;	
	}
	//alert(obj);
	return false;
}

function clearAll()
{
var howMany=document.forms[0].elements.length;

	for(var i=0;i<howMany;i++)
	{
	if((document.forms[0].elements[i].type=="text")||(document.forms[0].elements[i].type=="textarea"))
	 	document.forms[0].elements[i].value="";
	
	if(document.forms[0].elements[i].type=="select-one")
	document.forms[0].elements[i].selectedIndex=0;
	
	if((document.forms[0].elements[i].type=="radio")||(document.forms[0].elements[i].type=="checkbox"))
		document.forms[0].elements[i].checked=false;
	}
}

//Disable All
function disableAll()
{
var howMany=document.forms[0].elements.length;

	for(var i=0;i<howMany;i++)
	{
	if((document.forms[0].elements[i].type=="text")||(document.forms[0].elements[i].type=="textarea"))
	 	document.forms[0].elements[i].disabled=true;
	
	if(document.forms[0].elements[i].type=="select-one")
	document.forms[0].elements[i].disabled=true;
	
	if((document.forms[0].elements[i].type=="radio")||(document.forms[0].elements[i].type=="checkbox"))
		document.forms[0].elements[i].disabled=true;
	if((document.forms[0].elements[i].type=="button"))
		document.forms[0].elements[i].disabled=true;
	}
}

//Enable All
function makeEnable()

{
var howMany=document.forms[0].elements.length;
	for(var i=0;i<howMany;i++)
	{
		
	if((document.forms[0].elements[i].type=="text")||(document.forms[0].elements[i].type=="textarea"))
		document.forms[0].elements[i].disabled=false;
	if(document.forms[0].elements[i].type=="select-one")
		document.forms[0].elements[i].disabled=false;
	
	if((document.forms[0].elements[i].type=="radio")||(document.forms[0].elements[i].type=="checkbox"))
		document.forms[0].elements[i].disabled=false;
	}
}

// trying a common function for all validations Version 1.0 dated 28-12-2004 by Ayan Roy

function ValidateError() {
var validData=false;
var mandatory1=ValidateError.arguments[0];
for(var i=0;i<document.forms[0].elements.length;i++)
 {
var obj=document.forms[0].elements[i].name;

	var typename=obj.charAt(obj.lastIndexOf("_")-1);
    var mand_opt=obj.charAt(obj.length-1);
	
	if(mand_opt=="m") {
	validData=checkMandatory(document.forms[0].elements[i],mandatory1);
	   if(!validData)
	 	document.forms[0].elements[i].focus();
	}
	
	 if(typename=="n")
	{
	  if(document.forms[0].elements[i].value!=""){
	  validData=checkNumber(document.forms[0].elements[i]);
	    if(!validData)
	    document.forms[0].elements[i].select(); 
		}
	} 
	
	else if(obj.indexOf("Tele")!=-1)
	{
	 
	 if(document.forms[0].elements[i].value!=""){
	 validData=checkInternationalPhone(document.forms[0].elements[i]);
	    if(!validData)
	     document.forms[0].elements[i].select();
	 	}
	 }
	else if(obj.indexOf("Email")!=-1)
	{
	 if(document.forms[0].elements[i].value!=""){
	 validData=checkEmail(document.forms[0].elements[i]);
     	 if(!validData)
	    document.forms[0].elements[i].select();
	 }
	}
	
	} //for loop ended
	//alert(validData);
	 return validData;
} //function ValidateError() ended
 

function findObj(n, d) { //v4.01
  var p,i,x;  if(!d) d=document; if((p=n.indexOf("?"))>0&&parent.frames.length) {
    d=parent.frames[n.substring(p+1)].document; n=n.substring(0,p);}
  if(!(x=d[n])&&d.all) x=d.all[n]; for (i=0;!x&&i<d.forms.length;i++) x=d.forms[i][n];
  for(i=0;!x&&d.layers&&i<d.layers.length;i++) x=findObj(n,d.layers[i].document);
  if(!x && d.getElementById) x=d.getElementById(n); return x;
}

function eipl_valid(){
var i,nm,endchar,fieldname='';
var errors='';
var firstfield="";
var args=eipl_valid.arguments;
 for(i=0;i<(args.length-1);i+=2)
  {
  // test=args[i+2];
   fieldname=args[i+1];
   val=findObj(args[i]);
   endchar='';
   
  //test=val.value.charAt(val.value.length-1)
   if(val)   {	 nm=val.name; }
	endchar=nm.charAt(nm.length-1);
	//alert(nm+" , "+val);
	if(endchar=='m' || endchar=='M')
	  {
	   if(Trim(val.value).length==0)
	   		{
	   	   		errors+= '-> ' + fieldname +' is a mandatory field.\n'; 
				if(firstfield=="")	
				{
					firstfield=args[i];
				}
		   }
	   } //end m
	   
		 if(nm.toLowerCase().indexOf("_t_")!=-1)
		 {
	 	   		if(!checkInternationalPhone(val))
		   		{
	  	   		errors+= '-> ' +fieldname+' is not a valid telephone number.\n'; 
					if(firstfield=="") {	
					firstfield=args[i]; 
					}
				}
		 }
	
		//if(nm.indexOf("email")!=-1)
		if(nm.toLowerCase().indexOf("_e_")!=-1)
	 	{
		 var str=val.value;
		   if(str.length!=0)
			if ((str.indexOf('@') < 1) ||
		(str.indexOf('.',0) == -1) ||
		(str.indexOf('.') == str.length - 1) ||
		(str.indexOf(' ') != -1))
	      {
		    errors+= '-> '+'The e-mail address is  invalid.Please input in the correct format eg. myself@email.com !\n';
					if(firstfield=="") {
						firstfield=args[i]; }
			}
	  	  // if(!checkEmail(val) && val.value.length!=0)
		  //alert(checkEmail(val))
		 // if(!checkEmail(val))
		   // errors+= '-> '+'The e-mail address is  invalid.Please input in the correct format eg. myself@email.com !\n';
	 	}
		if(nm.toLowerCase().indexOf("_c_")!=-1)
		{
			if(!checkCurrency(val))
			{
			errors+= '-> '+fieldname+' is in invalid format.\n';
				if(firstfield=="") {	
				firstfield=args[i]; }
			}
		}
		
		if(nm.toLowerCase().indexOf("_d_")!=-1)
		{
		  //if(!isDate(val) && val.value.length!=0)
		 // errors+= '-> '+fieldname+' is in invalid date format.\n'; 
		
		  	if(!isDate(val) && val.value.length!=0)
		  	errors+= '-> ' +fieldname+' should be a valid date format in DD/MM/YYYY.\n';
		}
		if(endchar=='d')
		{
		  //if(!isDate(val) && val.value.length!=0)
		 // errors+= '-> '+fieldname+' is in invalid date format.\n'; 
		
		  	if(!isDate(val) && val.value.length!=0)
		  	errors+= '-> ' +fieldname+' should be a valid date format in DD/MM/YYYY.\n';
			if(firstfield=="")	
				{
					firstfield=args[i];
				}
		}
		
  } //for ended
  if(document.forms[0].name=="exch_form") //special validation for exchange rate setup page
  {
    if(!checkRate()) 
    errors+= '-> '+'From Currency Code & To Currency Code should not be same\n';
  }
  
   if(document.forms[0].name=="Vess_SchForm") //special validation for vessel scheduling setup page
  {
    if(!checkPort()) 
    errors+= '-> '+'Origin Port & Destination Port should not be same\n';
  }
  
  /* if(document.forms[0].name=="VoyageForm") //special validation for Voyage Assignment page
  {
    if(!checkPorts()) 
    errors+= '-> '+'Start Port & End Port should not be same\n';
  }
  */
  
  if(document.forms[0].name=="fixtureform") //special validation for Fixture Note page
  {
   //alert("Howdy!!!");
   if(!checkPOLPOD())
    errors+= '-> '+'PLR/POL should not be same as POD/PLD\n';
  }
  
  if (errors) 
  {
  	alert('The following error(s) occurred in the form entries:\n'+errors);
	var objnew=findObj(firstfield);
	if(firstfield)
  objnew.focus();
  
	}
  document.returnValue = (errors == '');
} //function ended



function chkNum(obj,objName)
{
	val = obj.value.trim(); 

	if (val && val.search(/^ *\d* *$/) != 0) {
	   //pnoFieldValidateError(TCV001, obj, objName);
	   obj.value='';
	   return false;
	}
	return true;		
}

function checkNumber(objName)
{
var objVal=objName.value;
	//if (objVal != parseInt(objVal)) { prev one written by Ayan
	if(objVal && objVal.search(/^ *\d* *$/) != 0) {
	   //pnoFieldValidateError(TCV001, obj, objName);
	   alert("Wrong entry, only numbers allowed here");
	   objName.focus();
	   return false;
	}
	else
	return true;
}


function checkEmail(obj)
{
 var str=obj.value;


	if ((str.indexOf('@') < 1) ||
		(str.indexOf('.',0) == -1) ||
		(str.indexOf('.') == str.length - 1) ||
		(str.indexOf(' ') != -1))
	{
		//alert('The e-mail address is  invalid.Please input in the correct format eg. myself@email.com !');
		//obj.focus();
		return false;
	}
	else 
	return true;
	
}

function checkMandatory(obj, objTitle){

	if (Trim(obj.value).length < 1) {
		alert('Please enter the ' + objTitle);
		obj.focus();
		return false;	
	}
	return true;

}


function checkCurrency(fieldName) {

decallowed = 2;  // how many decimals are allowed?

var fieldValue=fieldName.value;

if (isNaN(fieldValue) || fieldValue == "") {
return false;
}
else {
if (fieldValue.indexOf('.') == -1) fieldValue += ".";
dectext = fieldValue.substring(fieldValue.indexOf('.')+1, fieldValue.length);

if (dectext.length > decallowed)
{
return false;
      }
else {
//alert ("That number validated successfully.");
return true;
      }
   }
}


function CheckNumericSize(fieldName,msg,intSize,decSize) {

decallowed = decSize;  // how many decimals are allowed?
i=0;

var strF="";
for(n=0;n<intSize;n++)
		strF+="9";
strF+=".";
for(n=0;n<decSize;n++)
		strF+="9";




var fieldValue=fieldName.value;
if(fieldValue != "")
{
for(n=0;n<fieldValue.length;n++)
	{if(fieldValue.charAt(n)==".")
		i++;
	}

//alert("i="+i);
if(i>1)
	{alert(msg+" should be in "+strF + " Format");
	fieldName.focus();
	return false;
	}
}
	
if (isNaN(fieldValue) || fieldValue == "") {
return false;
}
else {


if (fieldValue.indexOf('.') == -1) fieldValue += ".";

dectext = fieldValue.substring(fieldValue.indexOf('.')+1, fieldValue.length);
inttext=fieldValue.substring(0,fieldValue.indexOf('.'));

if (dectext.length > decallowed || inttext.length>intSize)
{

alert(msg+" should be in "+strF + " Format");
fieldName.focus();
return false;
      }
else {
//alert ("That number validated successfully.");
return true;
      }
   }
}


function taLimit() {
 var taObj=event.srcElement;
 if (taObj.value.length==taObj.maxLength*1) return false;
}
 
function taCount(visCnt) { 
 var taObj=event.srcElement;
 if (taObj.value.length>taObj.maxLength*1) taObj.value=taObj.value.substring(0,taObj.maxLength*1);
 if (visCnt) visCnt.innerText=taObj.maxLength-taObj.value.length;
}


// Added by Kamal on 15-02-2006

function CheckRange(obj,l,h,title)
{if(Trim(obj.value)==0)return;

if(obj.value<l || obj.value>h)
	{alert(title+" shuld be within "+l+" and "+h);
	obj.focus();
	return;
	}
}


function chkTime(obj) {
		var eat = obj.value;
		if(eat=="") return;
		
		var n=0;
		
		var i=0;
				
if(eat != "")
{
for(n=0;n<eat.length;n++)
	{if(eat.charAt(n)==".")
		i++;
	}
//alert("i="+i);
if(i>1)
	{alert("Please input valid Time");
	obj.focus();
	return;
	}

if (eat.indexOf('.') == 0)
		{alert("Time should not start .");
		obj.focus();
		 return;
		}

if (eat.indexOf('.') == -1  && eat>23)
		{alert("Hour should not be greater than 23");
		obj.focus();
		 return;
		}
if (eat.indexOf('.')>0) 
	{
	dectext = eat.substring(eat.indexOf('.')+1, eat.length);
	inttext=eat.substring(0,eat.indexOf('.'));
	if(inttext<0 || inttext>23 || dectext<0 || dectext>59)
		{alert("Invalid time");
		obj.focus();
		 return;
		}
	else
		return true;
	}
}
return true;

}



	