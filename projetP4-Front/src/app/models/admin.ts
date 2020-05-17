import { Role } from './role';
export class Admin {
    id?:number;
    username:string;
    password:String;
    role:Role
    constructor()
    constructor(id?: number)
    constructor(id: number,username:string,password:String,role:Role)
    constructor(id?: number,username?:string,password?:String,role?:Role){
        this.id=id;
        this.username=username;
        this.password=password;
        this.role=role
    }
}
