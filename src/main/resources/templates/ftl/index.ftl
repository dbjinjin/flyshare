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

            $("#edit").on("click", function () {
                var rows = $("#table").bootstrapTable('getSelections');
                if (rows.length === 0) {

                }
            });

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
                sortOrder: "desc",//排序方式
                sortName: "id",//排序字段
                cache: false,//是否启用缓存
                sidePagination: "server",//服务端分页
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
                clickToSelect: true,
                queryParams: function (params) {
                    var temp = {
                        pageNumber: (params.offset / params.limit) + 1,//页码
                        pageSize: params.limit,   //每页数量
                        sortName: params.sort,      //排序列名
                        sortOrder: params.order, //排位命令（desc，asc）
                        menuname: params.search
                    };
                    //return JSON.stringify(temp);
                    return temp;
                },
                columns: [{
                    checkbox: true,
                    visible: true                  //是否显示复选框
                }, {
                    field: 'id',
                    title: 'ID',
                    align: 'center',
                    visible: false,
                    titleTooltip: "主键"
                }, {
                    field: 'menuname',
                    title: '菜单名称',
                    align: 'center'
                }, {
                    field: 'menuurl',
                    title: '菜单URL',
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
                    align: 'center',
                    sortable: true
                }, {
                    field: 'modifydate',
                    title: '修改时间',
                    align: 'center',
                    order: 'desc',
                    sortable: true
                }],
                onLoadSuccess: function () {

                },
                onLoadError: function () {

                },
                onDblClickRow: function (row) {

                }
            });
        }

        function confirmDelete() {
            $('#deleteModal').modal('hide');
            window.console.log("删除确定了?");
        }

        function confirmAdd() {
            $('#deleteModal').modal('hide');
            window.console.log("删除确定了?");
        }

    </script>
</head>
<body>
<div class="panel-body" style="padding-bottom:0px;">
    <div class="panel panel-default">
        <div class="panel-heading">查询条件</div>
        <div class="panel-body">

            <div id="toolbar" class="btn-group">
                <button id="add" class="btn btn-info" title="添加" data-toggle="modal"  data-target="#addModal">
                    <i class="glyphicon glyphicon-plus"></i> 添加
                </button>
                <button id="del" class="btn btn-danger" title="删除" style="margin-left:15px;" data-toggle="modal"  data-target="#deleteModal">
                    <i class="glyphicon glyphicon-minus"></i> 删除
                </button>
                <button id="edit" class="btn btn-warning" title="编辑" style="margin-left:15px;" data-toggle="modal"  data-target="#editModal">
                    <i class="glyphicon glyphicon-pencil"></i> 编辑
                </button>
                <button id="enable" class="btn btn-success" title="启用" style="margin-left:15px;">
                    <i class="glyphicon glyphicon-ok"></i> 启用
                </button>
                <button id="disable" class="btn btn-primary" title="停用" style="margin-left:15px;">
                    <i class="glyphicon glyphicon-remove"></i> 停用
                </button>
            </div>

            <table id="table"></table>

        </div>
    </div>


    <!-- 新增框 -->
    <div class="modal fade" id="addModal" tabindex="-1" role="dialog" aria-labelledby="myModalLabel" aria-hidden="true">
        <div class="modal-dialog">
            <div class="modal-content">
                <div class="modal-header">
                    <button type="button" class="close" data-dismiss="modal" aria-hidden="true">×</button>
                    <h4 class="modal-title" id="myModalLabel">新增菜单</h4>
                </div>
                <div class="modal-body">

                    <div class="form-group">
                        <label for="txt_departmentname">部门名称</label>
                        <input type="text" name="txt_departmentname" class="form-control" id="txt_departmentname"
                               placeholder="部门名称">
                    </div>

                    <div class="form-group">
                        <label for="txt_parentdepartment">上级部门</label>
                        <input type="text" name="txt_parentdepartment" class="form-control" id="txt_parentdepartment"
                               placeholder="上级部门">
                    </div>

                    <div class="form-group">
                        <label for="txt_departmentlevel">部门级别</label>
                        <input type="text" name="txt_departmentlevel" class="form-control" id="txt_departmentlevel"
                               placeholder="部门级别">
                    </div>

                    <div class="form-group">
                        <label for="txt_statu">描述</label>
                        <input type="text" name="txt_statu" class="form-control" id="txt_statu" placeholder="状态">
                    </div>

                </div>
                <div class="modal-footer">
                    <button type="button" class="btn btn-danger" onclick="confirmAdd()">确定</button>
                    <button type="button" class="btn btn-default" data-dismiss="modal">取消</button>
                </div>
            </div>
        </div>
    </div>

    <!-- 编辑 -->
    <div class="modal fade" id="editModal" tabindex="-1" role="dialog" aria-labelledby="myModalLabel" aria-hidden="true">
        <div class="modal-dialog">
            <div class="modal-content">
                <div class="modal-header">
                    <button type="button" class="close" data-dismiss="modal" aria-hidden="true">×</button>
                    <h4 class="modal-title" id="myModalLabel">新增菜单</h4>
                </div>
                <div class="modal-body">

                    <form class="form-horizontal" role="form">
                        <div class="form-group">
                            <label class="col-sm-2 control-label">Email</label>
                            <div class="col-sm-10">
                                <p class="form-control-static">email@example.com</p>
                            </div>
                        </div>
                        <div class="form-group">
                            <label for="inputPassword" class="col-sm-2 control-label">密码</label>
                            <div class="col-sm-10">
                                <input type="password" class="form-control" id="inputPassword" placeholder="请输入密码">
                            </div>
                        </div>
                    </form>

                </div>
                <div class="modal-footer">
                    <button type="button" class="btn btn-danger" onclick="confirmAdd()">确定</button>
                    <button type="button" class="btn btn-default" data-dismiss="modal">取消</button>
                </div>
            </div>
        </div>
    </div>


    <!-- 删除确定框 -->
    <div class="modal fade" id="deleteModal" tabindex="-1" role="dialog" aria-labelledby="myModalLabel" aria-hidden="true">
        <div class="modal-dialog">
            <div class="modal-content">
                <div class="modal-header">
                    <button type="button" class="close" data-dismiss="modal" aria-hidden="true">×</button>
                    <h4 class="modal-title" id="myModalLabel">确定框</h4>
                </div>
                <div class="modal-body">
                    是否确定删除选中数据?
                </div>
                <div class="modal-footer">
                    <button type="button" class="btn btn-danger" onclick="confirmDelete()">确定</button>
                    <button type="button" class="btn btn-default" data-dismiss="modal">取消</button>
                </div>
            </div>
        </div>
    </div>

</div>
</body>
</html>