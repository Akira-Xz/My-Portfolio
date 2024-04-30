import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';

@Injectable({
  providedIn: 'root'
})
export class LapsService {

  constructor(
    private httpClient: HttpClient,
  ) { }
  getLaps(){
    return this.httpClient.get<any>('http://localhost/lapsend/obtenerdatos.php')
  }
  getLap(id:any){
    return this.httpClient.get<any>('http://localhost/lapsend/obtenerundato.php?id=' + id)
  }
  insertLap(data:any){
    return this.httpClient.post<any>('http://localhost/lapsend/agregarEquipo.php', data)
  }
  deleteLap(id:any){
    return this.httpClient.delete<any>('http://localhost/lapsend/eliminarEquipo.php?id=' + id)
  }
  updateLap(data:any){
    return this.httpClient.put<any>('http://localhost/lapsend/actualizarEquipo.php', data)
  }
}
