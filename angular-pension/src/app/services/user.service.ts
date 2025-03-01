import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';
import { User } from '../user.model';

@Injectable({
  providedIn: 'root'
})
export class UserService {

  private basUrl = "http://localhost:8081/api/users/calculate"

  constructor(private httpClient: HttpClient) {
  }

  berekenPensioen(user: User): Observable<any> {
    return this.httpClient.post(`${this.basUrl}`, user);
  }


}
