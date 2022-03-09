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
    var range = $('#range').val();
    var rangeRegex = /^[+-]?\d+(\.\d+)?$/;
    numberOT = $("numberOfStops").val();
    var numberOTRegex = /^[0-9]{1,3}$/;

    if (range <= 0 || rangeRegex.test($('#range').val()) == false) {
        flag = false;
        $("#validRange").html("Range values is not valid");
    }
    else {
        $("#validRange").html("");
    }
    if (numberOT <= 0 || numberOTRegex.test($("#numberOfStops").val()) == false) {
        flag = false;
        $("#validNumberOfStop").html("Number of stop values is not valid");
    }
    else {
        $("#validNumberOfStop").html("");
    }
    console.log(flag)
}