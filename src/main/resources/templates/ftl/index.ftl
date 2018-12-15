<!DOCTYPE html>
<html>
<head>
    <title>Bootstrap 实例</title>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <link rel="stylesheet" href="bootstrap/css/bootstrap.min.css">
    <script src="jquery/jquery.min.js"></script>
    <script src="bootstrap/js/bootstrap.min.js"></script>
</head>
<body>

<div class="container">
    <div class="jumbotron">
        <h1>我的第一个 Bootstrap 页面</h1>
        <p>重置窗口大小，查看响应式效果！</p>
    </div>
    <div class="row">
        <div class="col-sm-4">
            <h3>第一列</h3>
            <p>学的不仅是技术，更是梦想！</p>
            <p>再牛逼的梦想,也抵不住你傻逼似的坚持！</p>
        </div>
        <div class="col-sm-4">
            <h3>第二列</h3>
            <p>学的不仅是技术，更是梦想！</p>
            <p>再牛逼的梦想,也抵不住你傻逼似的坚持！</p>
        </div>
        <div class="col-sm-4">
            <h3>第三列</h3>
            <p>学的不仅是技术，更是梦想！</p>
            <p>再牛逼的梦想,也抵不住你傻逼似的坚持！</p>
        </div>
    </div>
    <div class="row">
        <table class="table">
            <caption>上下文表格布局</caption>
            <thead>
                <tr>
                    <th>产品</th>
                    <th>付款日期</th>
                    <th>状态</th>
                </tr>
            </thead>
            <tbody>
            <tr class="active">
                <td>产品1</td>
                <td>23/11/2013</td>
                <td>待发货</td></tr>
            <tr class="success">
                <td>产品2</td>
                <td>10/11/2013</td>
                <td>发货中</td></tr>
            <tr class="warning">
                <td>产品3</td>
                <td>20/10/2013</td>
                <td>待确认</td></tr>
            <tr class="danger">
                <td>产品4</td>
                <td>20/10/2013</td>
                <td>已退货</td></tr>
            </tbody>
        </table>
        <ul class="pagination">
            <li><a href="#">&laquo;</a></li>
            <li class="active"><a href="#">1</a></li>
            <li class="disabled"><a href="#">2</a></li>
            <li><a href="#">3</a></li>
            <li><a href="#">4</a></li>
            <li><a href="#">5</a></li>
            <li><a href="#">&raquo;</a></li>
        </ul>
    </div>
</div>



</body>
</html>
