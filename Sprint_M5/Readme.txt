nombre de los integrantes: Norma Jeldres
ruta de los repositorios: https://github.com/Normajel/Sprint_M5.git

resumen del proyecto:

Acciones Realizadas:

Creación de Formulario de Contacto (contacto.jsp): Se creó un formulario HTML con campos para nombre, correo electrónico y consulta. 
Se utilizó Bootstrap para el diseño y la estructura básica del formulario.

Servlet de Contacto (Contacto.java): Se creó un servlet para manejar las solicitudes de envío del formulario de contacto. 
En el método doPost(), se procesaron los datos del formulario y se redirigió al usuario a una página de respuesta.

Página de Respuesta (RespuestaContacto.jsp): Se creó una página JSP para mostrar un mensaje de respuesta al usuario después de enviar el formulario de contacto. 
Esta página incluye el mensaje de agradecimiento y un enlace para volver al inicio.

Estilo CSS: Se utilizó un estilo CSS (pagina.css) para aplicar estilos adicionales a las páginas HTML y JSP, como el diseño y la estructura de 
la barra de navegación y el centrado del contenido en la página de respuesta.


Aspectos Relevantes:

Interacción Cliente-Servidor: Se implementó un mecanismo de interacción entre el cliente (navegador web) y 
el servidor (aplicación web) utilizando servlets de Java para manejar las solicitudes del cliente y generar respuestas dinámicas.

Validación de Datos: Se realizó una validación básica de los datos del formulario en el servlet para asegurarse de que los campos obligatorios 
estén completos antes de procesar la solicitud.

Redirección y Reenvío: Se utilizó la redirección (response.sendRedirect()) para enviar al usuario a una página de respuesta después de enviar el formulario de contacto. 
También se utilizó el reenvío (request.getRequestDispatcher().forward()) para mostrar el formulario de contacto inicial.

Diseño y Estilos: Se aplicaron estilos y diseño responsivo a las páginas HTML y JSP utilizando Bootstrap y CSS para mejorar la apariencia y la experiencia del usuario.

En resumen, se creó un formulario de contacto funcional en una aplicación web utilizando tecnologías Java EE como servlets y JSP, con validación de datos básica y 
una interfaz de usuario atractiva y receptiva. La implementación permitió una comunicación efectiva entre el cliente y el servidor, proporcionando una experiencia de usuario satisfactoria.