var flag;

$(document).ready(function () {
    $("#submit").click(function (event){
        validateData();
        if(flag==false){
            event.preventDefault();
        }
    });
});

function validateData() {
    flag = true;
    var nameRegex = /^[\w|\W]{1,50}$/i;
    //var symbolRegex = /^[^`~!@#$%^&*\(\)\\\/<>,.'+=-_?;:"\{\}\[\]]$/;
    var phoneRegex = /^[0-9]{10}$/;
    var hometownRegex = /^[\w,\W,]{1,50}$/i;

    if (nameRegex.test($("#fullName").val()) == false) {
        flag = false;
        $("#validName").html("Name values is not valid");
    }
    else {
        $("#validName").html("");
    }
    if (phoneRegex.test($("#phone").val()) == false) {
        flag = false;
        $("#validPhone").html("phone values is not valid");
    }
    else {
        $("#validPhone").html("");
    }
    if (hometownRegex.test($("#address").val()) == false) {
        flag = false;
        $("#validAddress").html("address values is not valid");
    }
    else {
        $("#validAddress").html("");
    }
    if ($('#level').val() == 0) {
            flag = false;
            $("#validLevel").html("please select level");
    }
    else {
        $("#validLevel").html("");
    }
    console.log(flag)
}