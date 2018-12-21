<script>
    function confirmAdd()
    {
    }
</script>
<div class="modal-header">
    <button type="button" class="close" data-dismiss="modal" aria-hidden="true">×</button>
    <h4 class="modal-title" id="myModalLabel">新增菜单</h4>
</div>
<div class="modal-body">

    <form class="form-horizontal" role="form">
        <fieldset>
            <div class="form-group">
                <label class="col-sm-2 control-label" for="menuname">菜单名称</label>
                <div class="col-sm-4">
                    <input class="form-control" id="menuname" type="text" placeholder=""/>
                </div>
                <label class="col-sm-2 control-label" for="menuurl">菜单URL</label>
                <div class="col-sm-4">
                    <input class="form-control" id="menuurl" type="text" placeholder=""/>
                </div>
            </div>
            <div class="form-group">
                <label class="col-sm-2 control-label" for="menustyle">菜单样式</label>
                <div class="col-sm-4">
                    <input class="form-control" id="menustyle" type="text" placeholder=""/>
                </div>
                <label class="col-sm-2 control-label" for="parentid">父级ID</label>
                <div class="col-sm-4">
                    <input class="form-control" id="parentid" type="password" placeholder=""/>
                </div>
            </div>
        </fieldset>
        <fieldset>
            <div class="form-group">
                <label  class="col-sm-2 control-label" for="sysid" >归属系统</label>
                <div class="col-sm-4">
                    <select id="sysid" class="form-control">
                        <option>--未选择--</option>
                        <option>大师底层</option>
                        <option>内容发布平台</option>
                        <option>消息中间件</option>
                    </select>
                </div>
                <label class="col-sm-2 control-label" for="inuse">是否启用</label>
                <div class="col-sm-4">
                    <select id="inuse" class="form-control">
                        <option>--未选择--</option>
                        <option>true</option>
                        <option>false</option>
                    </select>
                </div>
            </div>
        </fieldset>

        <fieldset>
            <div class="form-group">
                <label class="col-sm-2 control-label" for="ordno">排序序号</label>
                <div class="col-sm-4">
                    <input class="form-control" id="ordno" type="password" placeholder=""/>
                </div>
            </div>
        </fieldset>
    </form>
</div>
<div class="modal-footer">
    <button type="button" class="btn btn-danger" onclick="confirmAdd()">确定</button>
    <button type="button" class="btn btn-default" data-dismiss="modal">取消</button>
</div>