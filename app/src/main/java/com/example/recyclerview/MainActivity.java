package com.example.recyclerview;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ArrayList<ModelClass> arrayList;
    RecyclerView recyclerView;
    Adpater adpater;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        getSupportActionBar().hide();

        recyclerView = findViewById(R.id.recyler_view);
        arrayList = new ArrayList<>();

        arrayList.add(new ModelClass("Computer Programming", "Computer programming is the process of designing and building an executable computer program to accomplish a specific computing result or to perform a particular task",false));
        arrayList.add(new ModelClass("Java Programming", "Java is a high-level, class-based, object-oriented programming language that is designed to have as few implementation dependencies as possible.",false));
        arrayList.add(new ModelClass("Python", "Python is an interpreted high-level general-purpose programming language. Its design philosophy emphasizes code readability with its use of significant indentation. Its language constructs as well as its object-oriented approach aim to help programmers write clear, logical code for small and large-scale projects",false));
        arrayList.add(new ModelClass("Javascript", "JavaScript, often abbreviated JS, is a programming language that is one of the core technologies of the World Wide Web, alongside HTML and CSS. Over 97% of websites use JavaScript on the client side for web page behavior, often incorporating third-party libraries.",false));
        arrayList.add(new ModelClass("PHP", "PHP is a general-purpose scripting language geared towards web development. It was originally created by Danish-Canadian programmer Rasmus Lerdorf in 1994. The PHP reference implementation is now produced by The PHP Group.",false));

        arrayList.add(new ModelClass("HTML", "The HyperText Markup Language, or HTML is the standard markup language for documents designed to be displayed in a web browser. It can be assisted by technologies such as Cascading Style Sheets and scripting languages such as JavaScript.",false));
        arrayList.add(new ModelClass("CSS", "Cascading Style Sheets is a style sheet language used for describing the presentation of a document written in a markup language such as HTML. CSS is a cornerstone technology of the World Wide Web, alongside HTML and JavaScript.",false));
        arrayList.add(new ModelClass("Node Js", "Node.js is an open-source, cross-platform, back-end JavaScript runtime environment that runs on the V8 engine and executes JavaScript code outside a web browser.",false));
        arrayList.add(new ModelClass("React", "React is a free and open-source front-end JavaScript library for building user interfaces based on UI components. It is maintained by Meta and a community of individual developers and companies. React can be used as a base in the development of single-page or mobile applications.",false));
        arrayList.add(new ModelClass("Facebook", "Meta Platforms, Inc., doing business as Meta and formerly known as Facebook, Inc., is a multinational technology conglomerate based in Menlo Park, California. The company is the parent organization of Facebook, Instagram, and WhatsApp, among other subsidiaries.",false));
        arrayList.add(new ModelClass("Instagram", "Instagram is an American photo and video sharing social networking service founded by Kevin Systrom and Mike Krieger. In April 2012, Facebook Inc. acquired the service for approximately US$1 billion in cash and stock.",false));
        arrayList.add(new ModelClass("YouTube", "YouTube is an American online video sharing and social media platform owned by Google. It was launched on February 14, 2005 by Steve Chen, Chad Hurley, and Jawed Karim. It is the second most visited website, right after Google itself.",false));
        arrayList.add(new ModelClass("Twitter", "Twitter is an American microblogging and social networking service on which users post and interact with messages known as \"tweets\". Registered users can post, like, and retweet tweets, but unregistered users can only read those that are publicly available.",false));
        arrayList.add(new ModelClass("Fiverr", "Fiverr is an Israeli online marketplace for freelance services. The company provides a platform for freelancers to offer services to customers worldwide. Fiverr serves to allow listing and applying for small one-off jobs, or gigs, online.",false));
        arrayList.add(new ModelClass("Freelancer", "Freelancer is an Australian freelance marketplace website, which allows potential employers to post jobs that freelancers can then bid to complete. Founded in 2009, its headquarters is located in Sydney, Australia, though it also has offices in Vancouver, London, Buenos Aires, Manila, and Jakarta.",false));
        arrayList.add(new ModelClass("Upwork", "Upwork, formerly Elance-oDesk, is an American freelancing platform. In 2015, the Elance-oDesk merger was rebranded as Upwork and the company's full name is now Upwork Global Inc. Upwork is currently based in Santa Clara and San Francisco, California.",false));

        adpater = new Adpater(arrayList, MainActivity.this);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        recyclerView.setAdapter(adpater);
        adpater.notifyDataSetChanged();
    }
}