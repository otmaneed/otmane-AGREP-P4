import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';


@Injectable({
  providedIn: 'root'
})
export class AuthentificationService {
  apiUrl="http://localhost:8017";
  constructor(private http: HttpClient) { }
  login(model : any) {
    return this.http.post(`${this.apiUrl}/api/authenticate`, model);

   }
  Registre(registr){
    return this.http.post<any>(`${this.apiUrl}/api/login/admin`, registr)

      
  }
  getToken() {
    return localStorage.getItem('token')
  }
  loggedIn(){
    return !!localStorage.getItem('token')

  }

}
