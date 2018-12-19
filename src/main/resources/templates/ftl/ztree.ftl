<html lang="en">
<head>
    <meta charset="utf-8"/>
    <title>飞享系统</title>
    <meta name="description" content="飞享项目 基于SpringBoot BootStrap开发"/>
    <meta name="author" content="dbjinjin"/>
    <meta name="keyword" content="飞享项目 SpringBoot Java开发"/>
    <link rel="shortcut icon" href="ico/favicon.png"/>

    <script src="import/jquery/jquery.min.js"></script>
    <script src="import/zTree_v3/js/jquery.ztree.all.js"></script>

    <#--<link href="import/zTree_v3/css/metroStyle/metroStyle.css" rel="stylesheet" />-->
    <link href="import/zTree_v3/css/zTreeStyle/zTreeStyle.css" rel="stylesheet" />

    <script type="text/javascript">

        var setting = {	};

        var zNodes =[
            { name:"父节点1 - 展开", open:true,
                children: [
                    { name:"父节点11 - 折叠",
                        children: [
                            { name:"叶子节点111"},
                            { name:"叶子节点112"},
                            { name:"叶子节点113"},
                            { name:"叶子节点114"}
                        ]},
                    { name:"父节点12 - 折叠",
                        children: [
                            { name:"叶子节点121"},
                            { name:"叶子节点122"},
                            { name:"叶子节点123"},
                            { name:"叶子节点124"}
                        ]},
                    { name:"父节点13 - 没有子节点", isParent:true}
                ]},
            { name:"父节点2 - 折叠",
                children: [
                    { name:"父节点21 - 展开", open:true,
                        children: [
                            { name:"叶子节点211"},
                            { name:"叶子节点212"},
                            { name:"叶子节点213"},
                            { name:"叶子节点214"}
                        ]},
                    { name:"父节点22 - 折叠",
                        children: [
                            { name:"叶子节点221"},
                            { name:"叶子节点222"},
                            { name:"叶子节点223"},
                            { name:"叶子节点224"}
                        ]},
                    { name:"父节点23 - 折叠",
                        children: [
                            { name:"叶子节点231"},
                            { name:"叶子节点232"},
                            { name:"叶子节点233"},
                            { name:"叶子节点234"}
                        ]}
                ]},
            { name:"父节点3 - 没有子节点", isParent:true}

        ];

        $(document).ready(function(){
            $.fn.zTree.init($("#treeDemo"), setting, zNodes);
        });
    </script>

</head>
<body>
        <ul id="treeDemo" class="ztree"></ul>
</body>
</html>