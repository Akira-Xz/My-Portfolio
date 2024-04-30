import { Component, OnInit } from '@angular/core';
import { ServicioService} from '../poke-servicio.service';
//import { HttpClient } from '@angular/common/http';

@Component({
  selector: 'app-home',
  templateUrl: 'home.page.html',
  styleUrls: ['home.page.scss'],
})
export class HomePage implements OnInit {
  pokemones: any[] = [];
  constructor(private miServicio: ServicioService) {}
 
  ngOnInit(): void {
    this.getPokemones();
  }
  getPokemones(){
    this.miServicio.getDatos().subscribe(data => {
      this.pokemones = data.results;
    })
  }
  

}
