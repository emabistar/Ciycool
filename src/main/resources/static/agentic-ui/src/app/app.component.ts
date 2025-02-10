import { Component } from '@angular/core';
import { CommonModule } from '@angular/common';
import { FormsModule } from '@angular/forms';
import { ChatUiComponent } from './chat-ui/chat-ui.component';
import { NavbarUiComponent  } from './navbar-ui/navbar-ui.component'; // Import NavbarComponent
import { TransactionUiComponent} from './transaction-ui/transaction-ui.component';

@Component({
  selector: 'app-root',
  standalone: true,
  imports: [CommonModule, FormsModule, NavbarUiComponent], // Add NavbarComponent here
  template: `
    <app-navbar></app-navbar>  <!-- Add the navbar here -->
  `,
  styleUrls: ['./app.component.css']
})
export class AppComponent {
  title = 'AIAgent UI';
}
