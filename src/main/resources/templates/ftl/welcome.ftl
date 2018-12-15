<!DOCTYPE html>
<html>
<head>
    <title>Bootstrap 实例</title>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <link rel="stylesheet" href="bootstrap/css/bootstrap.min.css">
    <script src="jquery/jquery.min.js"></script>
    <script src="bootstrap/js/bootstrap.min.js"></script>
    <script>
        //开始进度条
        var timer;
        function startProcess() {
            var i = 0;
            var maxCount = 1000;
            timer = window.setInterval(function () {
                if (i < maxCount) {
                    i = i + 1;
                    var pencet =(i/maxCount)*100;
                    var subs = pencet.toFixed(1);
                    var width = ( subs+ "%");
                    $("#process-bar").width(width).text(width);
                }else{
                    clearInterval(timer);
                }
            }, 10);
        }
        //重置进度条
        function resetProcess() {
            clearInterval(timer);
            $("#process-bar").width("0%").text("");
        }
    </script>
</head>
<body>
<div class="container" style="padding-top: 150px">
    <div style="padding-bottom: 55px;">
        <button type="button" class="btn btn-default" onclick="startProcess()">进度条(开始)</button>
        <button type="button" class="btn btn-info" onclick="resetProcess()">进度条(重置)</button>
    </div>
    <div class="progress">
        <div id="process-bar" class="progress-bar progress-bar-success progress-bar-striped active" role="progressbar"
             aria-valuenow="0"
             aria-valuemin="0" aria-valuemax="1000" style="width: 0%">
            <span></span>
        </div>
    </div>
</div>
</body>
</html>
