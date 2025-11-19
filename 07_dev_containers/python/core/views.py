from django.http import HttpResponse

def home(request):
    return HttpResponse("✅ Django läuft im Dev Container! (http://localhost:8000)")
