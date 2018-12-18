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
                toolbar: '#toolbar',
                detailView: false,
                striped: true,
                dataType: 'json',
                pagination: true,// 是否显示分页
                sortable: true,//是否启用排序
                cache: false,//是否启用缓存
                sortOrder: "desc",//排序方式
                sidePagination: "server",//服务端分页
                sortName: "id",//排序字段
                strictSearch: true,
                pageNumber: 1,
                pageSize: 10,
                pageList: [10, 25, 50, 100, 500, 1000],
                search: true,//是否显示表格搜索
                height: 680,//高度
                searchText: searchText,
                showColumns: true,
                showRefresh: true,
                uniqueId: "id",
                showToggle: true,
                cardView: false,
                //得到查询的参数
                queryParams: function (params) {
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
                }, {
                    field: 'id',
                    title: 'Item ID',
                    align: 'center',
                    visible: false
                }, {
                    field: 'menuname',
                    title: '菜单名称',
                    align: 'center'
                }, {
                    field: 'menuurl',
                    title: '链接',
                    align: 'center'
                }, {
                    field: 'menustyle',
                    title: '菜单样式',
                    align: 'center'
                }, {
                    field: 'parentid',
                    title: '父ID',
                    align: 'center',
                    visible: false
                }, {
                    field: 'sysid',
                    title: '归属系统',
                    align: 'center'
                }, {
                    field: 'inuse',
                    title: '是否启用',
                    align: 'center',
                    formatter: function (value) {
                        var state;
                        if (value === true) {
                            state = "<span class='badge bg-red' style='padding:5px 10px;'>启用</span>";
                        } else {
                            state = "<span class='badge bg-green'  style='padding:5px 10px;'>停用</span>";
                        }
                        return state;
                    }
                }, {
                    field: 'ordno',
                    title: '排序序号',
                    align: 'center'
                }, {
                    field: 'predate',
                    title: '制单时间',
                    formatter: dateFormatProcess,
                    sortable: true,
                    align: 'center'
                }, {
                    field: 'predate',
                    title: '修改时间',
                    formatter: dateFormatProcess,
                    align: 'center'
                }, {
                    field: 'operaton',
                    title: '操作',
                    align: 'center',
                    events: registerEvents,//给按钮注册事件
                    formatter: addButtons //表格中增加按钮
                }],
                onLoadSuccess: function () {

                },
                onLoadError: function () {

                },
                onDblClickRow: function (row) {
                    window.alert(row.id);
                }
            });
        }

        function dateFormatProcess(value, row, index) {
            return value;
        }


        // 修改按钮、删除按钮
        function addButtons(value, row, index) {
            return [
                '<button type="button" id="btn_edit" class="btn btn-default" data-toggle="modal" data-target="#ModalInfo">修改</button>  ',
                '<button id="btn_delete" class="btn btn-warning">删除</button>'
            ].join('');
        }

        window.registerEvents = {

            // 点击修改按钮执行的方法
            'click #btn_edit': function (e, value, row, index) {
                window.alert("编辑\n" + row.id)
            },
            // 点击删除按钮执行的方法
            'click #btn_delete': function (e, value, row, index) {
                window.alert("删除\n" + row.id)
            }
        };


    </script>
</head>
<body>
    <div class="panel-body" style="padding-bottom:0px;">
        <div class="panel panel-default">
            <div class="panel-heading">查询条件</div>
            <div class="panel-body">
                <form id="formSearch" class="form-horizontal">
                    <div class="form-group" style="margin-top:15px">
                        <label class="control-label col-sm-1" for="txt_search_departmentname">名称</label>
                        <div class="col-sm-3">
                            <input type="text" class="form-control" id="txt_search_departmentname">
                        </div>
                        <label class="control-label col-sm-1" for="txt_search_statu">状态</label>
                        <div class="col-sm-3">
                            <input type="text" class="form-control" id="txt_search_statu">
                        </div>
                        <div class="col-sm-4" style="text-align:left;">
                            <button type="button" style="margin-left:50px" id="btn_query" class="btn btn-primary">查询
                            </button>
                        </div>
                    </div>
                </form>
            </div>
        </div>

        <div id="toolbar" class="btn-group">
            <button id="add" class="btn btn-default" title="添加">
                <i class="glyphicon glyphicon-plus"></i> 添加
            </button>
            <button id="del" class="btn btn-default" title="删除">
                <i class="glyphicon glyphicon-minus"></i> 删除
            </button>
        </div>
        <table id="table"></table>

    </div>
</body>
</html>