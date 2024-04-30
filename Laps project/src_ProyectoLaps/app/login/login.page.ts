import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';

@Component({
  selector: 'app-login',
  templateUrl: './login.page.html',
  styleUrls: ['./login.page.scss'],
})
export class LoginPage implements OnInit {

  constructor(
    private router : Router,
  ) { }

  ngOnInit() {
    const form = document.getElementById('myLogin') as HTMLFormElement;
    form.addEventListener('submit', function(e) {
      e.preventDefault();
      const formData = new FormData(form);
      const user = (form.elements.namedItem('user') as HTMLInputElement).value;
      const pass = (form.elements.namedItem('pass') as HTMLInputElement).value;
      
      //Validar datos
      if (user == '' || pass == '') {
        alert('Todos los campos son obligatorios');
        return;
      }


      //Guardar en localstorage
      localStorage.setItem('user', user);
      localStorage.setItem('pass', pass);

      alert("Sesion iniciada");
    });
  }

  login(){
    this.router.navigate(['info-id']);
  }

}
