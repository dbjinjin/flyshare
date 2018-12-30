<html lang="en">
<head>
    <meta charset="utf-8"/>
    <title>飞享系统</title>
    <meta name="description" content="飞享项目 基于SpringBoot BootStrap开发"/>
    <meta name="author" content="dbjinjin"/>
    <meta name="keyword" content="飞享项目 SpringBoot Java开发"/>
    <link rel="shortcut icon" href="ico/favicon.png"/>

    <link rel="stylesheet" href="bootstrap/css/bootstrap.min.css">
    <link rel="stylesheet" href="bootstrap-table/bootstrap-table.min.css">
    <link rel="stylesheet" href="bootstrap-dialog/css/bootstrap-dialog.css">

    <script src="jquery/jquery.min.js"></script>
    <script src="bootstrap/js/bootstrap.min.js"></script>
    <script src="bootstrap-table/bootstrap-table.min.js"></script>
    <script src="bootstrap-table/locale/bootstrap-table-zh-CN.min.js"></script>
    <script src="bootstrap-dialog/js/bootstrap-dialog.js"></script>


    <script>
        var bootTable;
        $(function () {

            initTable();

            /**
             * 新增
             */
            $("#add").on("click", function () {
                $("#addModal").modal({show: true, remote: "./menu-add.html"});
            });

            /**
             * 编辑
             */
            $("#edit").on("click", function () {
                var rows = $("#table").bootstrapTable('getSelections');
                if (rows.length === 0) {
                    BootstrapDialog.show({
                        title: '提示',
                        size: BootstrapDialog.SIZE_SMALL,
                        type: BootstrapDialog.TYPE_INFO,
                        message: '请选择编辑项!',
                        buttons: [{
                            label: '确定',
                            action: function (dialog) {
                                dialog.close();
                            }
                        }]
                    });

                } else {
                    $("#editModal").modal({show: true, remote: "./menu-edit.html?id=" + rows[0].id});
                }
            });

            /**
             * 删除
             */
            $("#del").on("click", function () {
                var rows = $("#table").bootstrapTable('getSelections');
                if (rows.length === 0) {
                    BootstrapDialog.show({
                        title: '提示',
                        size: BootstrapDialog.SIZE_SMALL,
                        type: BootstrapDialog.TYPE_INFO,
                        message: '请选择删除项!',
                        buttons: [{
                            label: '确定',
                            action: function (dialog) {
                                dialog.close();
                            }
                        }]
                    });
                } else {
                    BootstrapDialog.confirm({
                        title: '确定',
                        message: '是否确定【删除】选中用户？',
                        size: BootstrapDialog.SIZE_SMALL,
                        type: BootstrapDialog.TYPE_WARNING,
                        closable: true, // <-- Default value is false
                        draggable: true, // <-- Default value is false
                        btnCancelLabel: '取消', // <-- Default value is 'Cancel',
                        btnOKLabel: '确定', // <-- Default value is 'OK',
                        btnOKClass: 'btn-danger', // <-- If you didn't specify it, dialog type will be used,
                        callback: function (result) {
                            if (result) {

                            } else {

                            }
                        }
                    });
                }
            });

            /**
             * 启用
             */
            $("#enable").on("click", function () {
                var rows = $("#table").bootstrapTable('getSelections');
                if (rows.length === 0) {
                    BootstrapDialog.show({
                        title: '提示',
                        size: BootstrapDialog.SIZE_SMALL,
                        type: BootstrapDialog.TYPE_INFO,
                        closable: true,
                        closeByBackdrop: false,
                        closeByKeyboard: false,
                        message: '请选择【启用】项!',
                        buttons: [{
                            label: '确定',
                            action: function (dialog) {
                                dialog.close();
                            }
                        }]
                    });
                } else {
                    BootstrapDialog.confirm({
                        title: '确定',
                        message: '是否确定【启用】选中用户？',
                        size: BootstrapDialog.SIZE_SMALL,
                        type: BootstrapDialog.TYPE_WARNING,
                        closable: true, // <-- Default value is false
                        draggable: true, // <-- Default value is false
                        btnCancelLabel: '取消', // <-- Default value is 'Cancel',
                        btnOKLabel: '确定', // <-- Default value is 'OK',
                        btnOKClass: 'btn-danger', // <-- If you didn't specify it, dialog type will be used,
                        callback: function (result) {
                            if (result) {
                                var id = rows[0].id;
                                $.ajax({
                                    type: "POST",
                                    url: "./menu-update.html",
                                    data: {
                                        id: id,
                                        inuse: true
                                    },
                                    dataType: "json",
                                    success: function(data)
                                    {
                                        //刷新
                                        $('#table').bootstrapTable('refresh');
                                    }
                                });
                            }
                        }
                    });
                }
            });

            /**
             * 停用
             */
            $("#disable").on("click", function () {
                var rows = $("#table").bootstrapTable('getSelections');
                if (rows.length === 0) {
                    BootstrapDialog.show({
                        title: '提示',
                        size: BootstrapDialog.SIZE_SMALL,
                        type: BootstrapDialog.TYPE_INFO,
                        message: '请选择【停用】项!',
                        buttons: [{
                            label: '确定',
                            action: function (dialog) {
                                dialog.close();
                            }
                        }]
                    });
                } else {
                    BootstrapDialog.confirm({
                        title: '确定',
                        message: '是否确定【停用】选中用户？',
                        type: BootstrapDialog.TYPE_WARNING,
                        size: BootstrapDialog.SIZE_SMALL,
                        closable: true,
                        draggable: true,
                        btnCancelLabel: '取消',
                        btnOKLabel: '确定',
                        btnOKClass: 'btn-danger',
                        callback: function (result) {
                            if (result) {
                                var id = rows[0].id;
                                $.ajax({
                                    type: "POST",
                                    url: "./menu-update.html",
                                    data: {
                                        id: id,
                                        inuse: false
                                    },
                                    dataType: "json",
                                    success: function(data)
                                    {
                                        //刷新
                                        $('#table').bootstrapTable('refresh');
                                    }
                                });
                            }
                        }
                    });
                }
            });


            $('#editModal').on('hidden.bs.modal', function () {
                $(this).removeData('bs.modal');
            });

            $('#addModal').on('hidden.bs.modal', function () {
                $(this).removeData('bs.modal');
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
                singleSelect: true,
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

    </script>
</head>
<body>
<div class="panel-body" style="padding-bottom:0px;">
    <div class="panel panel-default">
        <div class="panel-heading">查询条件</div>
        <div class="panel-body">

            <div id="toolbar" class="btn-group">
                <button id="add" class="btn btn-info"
                        title="添加" <#--data-toggle="modal" data-target="#addModal" href="./menu-add.html"-->>
                    <i class="glyphicon glyphicon-plus"></i> 添加
                </button>
                <button id="del" class="btn btn-danger" title="删除"
                        style="margin-left:15px;" <#--data-toggle="modal" data-title="确定" data-content="是否确定删除选中数据?"-->>
                    <i class="glyphicon glyphicon-minus"></i> 删除
                </button>
                <button id="edit" class="btn btn-warning" title="编辑" style="margin-left:15px;">

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
            </div>
        </div>
    </div>

    <!-- 编辑 -->
    <div class="modal fade" id="editModal" tabindex="-1" role="dialog" aria-labelledby="myModalLabel"
         aria-hidden="true">
        <div class="modal-dialog">
            <div class="modal-content">
            </div>
        </div>
    </div>

</div>
</body>
</html>