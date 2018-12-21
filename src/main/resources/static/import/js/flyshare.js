
function showInfoDialog(content)
{
    var modal = $('#infoModal');
    modal.find('.modal-body span').text(content);
    modal.modal('show');
}

function showConrimDialog(content)
{
    var modal = $('#confirmModal');
    modal.find('.modal-body span').text(content);
    modal.modal('show');
}

$('#infoModal').on('show.bs.modal', function (event) {
    $(this).removeData('bs.modal');
});

$('#confirmModal').on('show.bs.modal', function (event) {
    $(this).removeData('bs.modal');
});