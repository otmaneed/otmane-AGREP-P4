import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';


@Injectable({
  providedIn: 'root'
})
export class RoleService {
  apiUrl="http://localhost:8017";
  constructor(private http:HttpClient) { }
  addRoles(role){
    return this.http.post<any>(`${this.apiUrl}/api/Role` , role)
  }
  modifierRoles(id , role){
    return this.http.put<any>(`${this.apiUrl}/api/Role/${id}`, role)
  }
  getRoles(){
       return this.http.get<any>(`${this.apiUrl}/api/Role`)
  }
  getOneRoles(id){
    return this.http.get<any>(`${this.apiUrl}/api/Role/${id}`)
}
suprimerRoles(id){
  return this.http.delete<any>(`${this.apiUrl}/api/Role/${id}`)
}
}
