import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';

@Injectable({
  providedIn: 'root'
})
export class ServicioService {

  constructor(private http : HttpClient) { }
  getDatos(){
    return this.http.get<any>('https://pokeapi.co/api/v2/pokemon/');
  }
}