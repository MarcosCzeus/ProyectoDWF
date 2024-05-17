
function accesorioseeliminar(id) {
    Swal.fire({
        title: "¿Estás seguro de eliminar?",
        text: "¡No podrás revertir esto!",
        icon: "warning",
        showCancelButton: true,
        confirmButtonColor: "#3085d6",
        cancelButtonColor: "#d33",
        confirmButtonText: "Sí, eliminarlo"
    }).then((result) => {
        if (result.isConfirmed) {
            $.ajax({
                url: "/caeliminar/" + id,
                success: function(res) {
                    console.log(res);
                    Swal.fire({
                        title: "¡Eliminado!",
                        text: "El registro ha sido eliminado.",
                        icon: "success"
                    }).then((ok) => {
                        if (ok.isConfirmed) {
                            location.href = "/listarca";
                        }
                    });
                },
                error: function(xhr, status, error) {
                    console.error(xhr.responseText);
                    Swal.fire({
                        title: "Error",
                        text: "Ha ocurrido un error al intentar eliminar el registro.",
                        icon: "error"
                    });
                }
            });
        } else {
            Swal.fire("Cancelado", "Tu registro está a salvo :)", "error");
        }
    });
}