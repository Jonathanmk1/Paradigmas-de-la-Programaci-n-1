para hacer un readme.md es asi y agregas la descripción/documentación del proyecto.



de un repositorio de github, 
entrando a powersell 
1. realizar una nueva carpeta nueva con el nombre que queramos:
mkdir source/repo/

2. entramos a la carpeta que acabamos de crear
cd .\source\repos\

3. despues de eso, creamos la carpeta mkdir
mkdir Kimera

4. entramos a la carpeta que acabamos de crear
cd .\Kimera\

5. ahora si, clonamos el repositorio que deseemos
git clone https://"aqui va la url" .
	el punto señala que se va a usar todo en el proyecto

6. se activa el entorno virtual, -m lacrea
python -m venv env

7 entramos a la interfaz de vsc con 
code .

8. activamos nuestro entorno virtual
.\PID\Scripts\activate

9. si queremos instalar las librerias de un proyecto debemos de usar pip install -r requirements.txt

10. encenedemos el servidor: 
python manage.py runserver

11. las migraciones:
python manage.py makemigrations

12. python manage.py migrate

13. en el servidor creamos un super usuario
python manage.py createsuperuser

14. iniciamos de nuevo el servidor:
python manage.py runserver

























para subir un proyecto a un repo:
1. entramos a powersell 

2. después entramos a la carpeta del proyecto que deseamos entrar con CD, por ejemplo la carpeta se llama "EjerciciosParcialPPI", asi que buscamos la ruta:
 cd '.\OneDrive - Universidad Autónoma del Estado de México\Documents\NetBeansProjects\EjerciciosParcialPPI\'

3. iniciamos un repositorio:
git init

4. efectuamos una lista para ver que archivos tengo en el directorio (opcional)
ls 

5. ver los archivos que están dentro del ciclo de detención de cambios de git:
git status

6. efectuamos el comando git add para agregar los folders o archivos individuales, 
	a) si quiero todas las carpetas del proyecto es:
		git add .
	b) si quiero un folder en especifico:
		git add "nombre_folder"

7. damos de nuevo git status para ver el estado actual del reposutorio.
git status

8. agregamos el primer commit con la descripción que queramos con el comando:
git commit -m "lo que sea"

9. agregamos el repositorio al repo remoto con el comando:
git remote add origin "url del repo"

10. vemos que rama esta por defecto (opcional):
git branch

11. cambiamos el brach que esta por defecto por main:
git branch -M  main

12. agregamos el push de repo remoto con el comando:
git push -u origin main