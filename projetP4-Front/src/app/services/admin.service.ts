import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';
import { Admin } from './../models/admin';
import { HttpClient } from '@angular/common/http';


@Injectable({
  providedIn: 'root'
})
export class AdminService {
  apiUrl="http://localhost:8017";
  constructor(private http:HttpClient) { }
    getAdmins(){
    return this.http.get<any>(`${this.apiUrl}/api/admin`)
  }
modifierAdmin(id , admin){
  return this.http.put<any>(`${this.apiUrl}/api/admin/${id}`, admin)
}
suprimerAdmin(id){
  return this.http.delete<any>(`${this.apiUrl}/api/admin/${id}`)
}

}
