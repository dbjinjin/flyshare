<script>
    function confirmEdit()
    {
    }
</script>

<div class="modal-header">
    <button type="button" class="close" data-dismiss="modal" aria-hidden="true">×</button>
    <h4 class="modal-title" id="myModalLabel">编辑菜单</h4>
</div>
<div class="modal-body">
    <form class="form-horizontal" role="form">
        <fieldset>
            <div class="form-group" style="display: none">
                <label class="col-sm-2 control-label" for="menuname">ID</label>
                <div class="col-sm-4">
                    <p class="form-control-static">${menu.id}</p>
                </div>
            </div>
            <div class="form-group">
                <label class="col-sm-2 control-label" for="menuname">菜单名称</label>
                <div class="col-sm-4">
                    <input class="form-control" id="menuname" type="text" placeholder="" value="${menu.menuname}"/>
                </div>

                <label class="col-sm-2 control-label" for="menuurl">菜单URL</label>
                <div class="col-sm-4">
                    <input class="form-control" id="menuurl" type="text" placeholder="" value="${menu.menuurl}"/>
                </div>

            </div>
        </fieldset>
        <fieldset>
            <div class="form-group">
                <label class="col-sm-2 control-label" for="menustyle">菜单样式</label>
                <div class="col-sm-4">
                    <input class="form-control" id="menustyle" type="text" placeholder="" value="${menu.menustyle}"/>
                </div>
                <label class="col-sm-2 control-label" for="parentid">父级ID</label>
                <div class="col-sm-4">
                    <input class="form-control" id="parentid" type="text" placeholder="" value="${menu.parentid}"/>
                </div>
            </div>
        </fieldset>

        <fieldset>
            <div class="form-group">
                <label  class="col-sm-2 control-label" for="sysid" >归属系统</label>
                <div class="col-sm-4">
                    <select id="sysid" class="form-control">
                        <#list dict.dictInfos as dictInfo>
                            <option value="${dictInfo.code}">${dictInfo.langname1}</option>
                        </#list>
                    </select>
                </div>
                <label class="col-sm-2 control-label" for="inuse">是否启用</label>
                <div class="col-sm-4">
                    <select id="inuse" class="form-control">
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
                    <input class="form-control" id="ordno" type="text" placeholder="" value="${menu.ordno}"/>
                </div>
            </div>
        </fieldset>
    </form>
</div>
<div class="modal-footer">
    <button type="button" class="btn btn-danger"  data-dismiss="modal" onclick="confirmEdit()">确定</button>
    <button type="button" class="btn btn-default" data-dismiss="modal">取消</button>
</div>