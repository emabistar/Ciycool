import {Component} from '@angular/core';
import {CommonModule} from '@angular/common';
import {FormsModule} from '@angular/forms';
import {HttpClient, HttpDownloadProgressEvent, HttpEventType} from '@angular/common/http';
import {MarkdownComponent} from 'ngx-markdown';

@Component({
  selector: 'app-chat-ui',
  standalone: true,
  imports: [CommonModule, FormsModule, MarkdownComponent],
  templateUrl: './chat-ui.component.html',
  styleUrls: ['./chat-ui.component.css']
})
export class ChatUiComponent {

   question:any;
   response : any;
   constructor(private http:HttpClient) {
   }
  askAgent() {
     this.response ="";
    this.http.get(`http://localhost:8091/askAgent?question=${this.question}`,
      { responseType: 'text',observe:'events',reportProgress:true })
      .subscribe({
        next: evt => {
          if(evt.type ===HttpEventType.DownloadProgress){
            this.response =(evt as HttpDownloadProgressEvent).partialText
          }
        },
        error: (err) => {
          console.error("Error:", err); // Log the error once
        },
        complete:()=>{

        }
      });
  }



  /**uestion: string = '';
  messages: { sender: string, text: string }[] = [
    { sender: 'Agent', text: 'Hello! How can I assist you today?' },
    { sender: 'You', text: 'What is the latest update on my order?' },
    { sender: 'Agent', text: 'Your order is being processed and will be shipped soon.' }


  askAgent() {
    if (this.question.trim()) {
      this.messages.push({ sender: 'You', text: this.question });
      this.messages.push({ sender: 'Agent', text: `Response to '${this.question}'` });
      this.question = '';
    }
  }
   ];**/
}
