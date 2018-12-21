<div class="modal-header">
    <button type="button" class="close" data-dismiss="modal" aria-hidden="true">×</button>
    <h4 class="modal-title" id="myModalLabel">新增菜单</h4>
</div>
<div class="modal-body">

    <form class="form-horizontal" role="form">
        <fieldset>
            <legend>配置数据源</legend>
            <div class="form-group">
                <label class="col-sm-2 control-label" for="ds_host">主机名</label>
                <div class="col-sm-4">
                    <input class="form-control" id="ds_host" type="text" placeholder="192.168.1.161"/>
                </div>
                <label class="col-sm-2 control-label" for="ds_name">数据库名</label>
                <div class="col-sm-4">
                    <input class="form-control" id="ds_name" type="text" placeholder="msh"/>
                </div>
            </div>
            <div class="form-group">
                <label class="col-sm-2 control-label" for="ds_username">用户名</label>
                <div class="col-sm-4">
                    <input class="form-control" id="ds_username" type="text" placeholder="root"/>
                </div>
                <label class="col-sm-2 control-label" for="ds_password">密码</label>
                <div class="col-sm-4">
                    <input class="form-control" id="ds_password" type="password" placeholder="123456"/>
                </div>
            </div>
        </fieldset>
        <fieldset>
            <legend>选择相关表</legend>
            <div class="form-group">
                <label for="disabledSelect"  class="col-sm-2 control-label">表名</label>
                <div class="col-sm-10">
                    <select id="disabledSelect" class="form-control">
                        <option>禁止选择</option>
                        <option>禁止选择</option>
                    </select>
                </div>
            </div>
        </fieldset>

        <fieldset>
            <legend>字段名</legend>
            <div class="form-group">
                <label for="disabledSelect"  class="col-sm-2 control-label">表名</label>
                <div class="col-sm-10">
                    <select id="disabledSelect" class="form-control">
                        <option>禁止选择</option>
                        <option>禁止选择</option>
                    </select>
                </div>
            </div>
        </fieldset>
    </form>
</div>
<div class="modal-footer">
    <button type="button" class="btn btn-danger" onclick="confirmAdd()">确定</button>
    <button type="button" class="btn btn-default" data-dismiss="modal">取消</button>
</div>