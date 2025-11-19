# Django + Dev Container (VS Code)

Dieses Projekt ist so vorbereitet, dass du es direkt in **Visual Studio Code** mit einem **Dev Container** öffnen kannst.

## Voraussetzungen
- Docker Desktop (oder Docker Engine)
- Visual Studio Code
- VS Code Extension: **Dev Containers**

## Start
1. Ordner in VS Code öffnen
2. Command Palette: **Dev Containers: Reopen in Container**
3. Im Container-Terminal:
   ```bash
   python manage.py runserver 0.0.0.0:8000
   ```
4. Browser: http://localhost:8000

## Hinweise
- SQLite ist vorkonfiguriert.
- `postCreateCommand` installiert Dependencies und führt `migrate` aus.
