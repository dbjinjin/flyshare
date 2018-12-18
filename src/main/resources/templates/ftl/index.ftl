<html lang="en">
<head>
    <meta charset="utf-8"/>
    <title>飞享系统</title>
    <meta name="description" content="飞享项目 基于SpringBoot BootStrap开发"/>
    <meta name="author" content="dbjinjin"/>
    <meta name="keyword" content="飞享项目 SpringBoot Java开发"/>
    <link rel="shortcut icon" href="ico/favicon.png"/>

    <link rel="stylesheet" href="import/bootstrap/css/bootstrap.min.css">
    <link rel="stylesheet" href="import/bootstrap-table/bootstrap-table.min.css">

    <script src="import/jquery/jquery.min.js"></script>
    <script src="import/bootstrap/js/bootstrap.min.js"></script>
    <script src="import/bootstrap-table/bootstrap-table.min.js"></script>
    <script src="import/bootstrap-table/locale/bootstrap-table-zh-CN.min.js"></script>

    <script>

        var bootTable;

        $(function () {
            initTable();
        });

        var searchText = $('.search').find('input').val();

        function initTable() {
            bootTable = $('#table').bootstrapTable({
                url: './menu-list',
                method: 'post',
                contentType: 'application/json',
                dataType: 'json',
                pagination: true,
                sortable: true,
                sortOrder: "desc",
                sidePagination:"server",
                sortName: "id",
                pageNumber: 1,
                pageSize: 10,
                pageList: [10, 25, 50, 100],
                search: true,
                height: 550,
                searchText : searchText,
                showColumns: true,
                showRefresh: true,
                uniqueId: "id",
                showToggle: true,
                cardView: false,
                //得到查询的参数
                queryParams : function (params) {
                    var temp = {
                        pageNumber: (params.offset / params.limit) + 1,//页码
                        pageSize: params.limit,   //每页数量
                        sortName: params.sort,      //排序列名
                        sortOrder: params.order //排位命令（desc，asc）
                    };
                    //return JSON.stringify(temp);
                    return temp;
                },
                columns: [{
                    checkbox: true,
                    visible: true                  //是否显示复选框
                },{
                    field: 'id',
                    title: 'Item ID'
                }, {
                    field: 'menuname',
                    title: '菜单名称'
                }, {
                    field: 'menuurl',
                    title: '链接'
                }, {
                    field: 'menustyle',
                    title: '菜单样式'
                }, {
                    field: 'parentid',
                    title: '父ID'
                }, {
                    field: 'sysid',
                    title: '归属系统'
                }, {
                    field: 'inuse',
                    title: '是否启用'
                }, {
                    field: 'ordno',
                    title: '排序序号'
                }, {
                    field: 'predate',
                    title: '制单时间',
                    formatter: "yyyy-MM-dd hh:mm:ss",
                    sortable: true
                }, {
                    field: 'predate',
                    title: '修改时间',
                    formatter: "yyyy-MM-dd hh:mm:ss"
                }],
                onLoadSuccess: function () {

                },
                onLoadError: function () {

                },
                onDblClickRow: function (row) {

                }
            });
        }
    </script>
</head>
<body>

<table id="table"></table>
</body>
</html>