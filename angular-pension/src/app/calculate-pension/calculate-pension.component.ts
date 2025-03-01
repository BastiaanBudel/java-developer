import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';
import { UserService } from '../services/user.service';
import { User } from '../user.model';
import { FormsModule } from '@angular/forms';

@Component({
  selector: 'app-calculate-pension',
  imports: [FormsModule],
  templateUrl: './calculate-pension.component.html',
  styleUrl: './calculate-pension.component.css'
})
export class CalculatePensionComponent implements OnInit {

  user: User = new User();
  berekendeWaarde: number | undefined;
  constructor(private userService: UserService, private router: Router) { }

  ngOnInit(): void {
  }

  berekenPensioen() {
    this.userService.berekenPensioen(this.user).subscribe({
      next: (data: number) => {
        console.log(data);
        this.berekendeWaarde = this.roundToTwoDecimalPlaces(data);
        console.log(this.berekendeWaarde);
      },
      error: (e) => {
        console.log(e);
      }
    });
  }

  /*redirectToUserList() {
    this.router.navigate(['/users']);
  }*/

  onSubmit() {
    console.log(this.user);
    this.berekenPensioen();
  }

  roundToTwoDecimalPlaces(value: number): number {
    return Math.round(value * 100) / 100;
  }
}
