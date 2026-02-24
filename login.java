
public class login
{
    User: La clase principal. Contiene username, passwordHash (nunca guardes contraseñas en texto plano), email y status.

Role: Define los permisos (ej: "Admin", "User", "Guest"). Se relaciona con User para determinar qué puede hacer cada uno.

Session: Representa una conexión activa. Atributos: tokenID, creationDate, expirationDate y una referencia al User.

2. Lógica de Seguridad (El "Cómo")
Clases encargadas de procesar la información sensible.

AuthService: El cerebro del sistema. Tiene métodos como login(user, pass), logout() y resetPassword().

PasswordHasher: Clase utilitaria. Se encarga de convertir la contraseña en un hash seguro y de verificar si coinciden (usando algoritmos como BCrypt o SHA-256).

TokenManager: Genera y valida los tokens de acceso (como JWT). Es vital para mantener la sesión sin pedir la contraseña en cada clic.

3. Gestión y Persistencia (El "Dónde")
Clases que manejan el flujo de datos y el almacenamiento.

UserRepository: La interfaz que se comunica con la base de datos para buscar usuarios por nombre o ID.

Authenticator: Se encarga específicamente de la verificación de credenciales. Si los datos son correctos, le pide al TokenManager que cree una sesión.

AuthMiddleware / Filter: Una clase que intercepta las peticiones al sistema para revisar si el usuario tiene un token válido antes de dejarlo pasar.

LoginAttempt: Clase de auditoría. Registra intentos
}